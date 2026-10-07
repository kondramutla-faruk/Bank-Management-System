package service;
import dao.AccountDAO;
import java.sql.*;
import exception.*;
import model.Account;
import dao.TransactionDAO;
import java.time.LocalDateTime;
import model.Transaction;
import util.DBConnection;

public class AccountService{
  private AccountDAO dao;
  private  Connection con;
    public AccountService() throws SQLException{
        con= DBConnection.getConnection();
        dao=new AccountDAO(con);
    }
    public void addAccount(Account account) throws SQLException{
        dao.addAccount(account);
    }
    public void getAccounts() throws SQLException{
        dao.getAccounts();
    }
    public void deposit(long accountNumber, double amount) throws SQLException,AccountNotFoundException,InvalidAmountException{
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than 0");
        }
        double currentBalance = dao.getBalance(accountNumber);
        double newBalance = currentBalance + amount;
        dao.updateBalance(accountNumber, newBalance);
        TransactionDAO transactionDAO = new TransactionDAO(con);
        Transaction transaction = new Transaction(0, accountNumber, "Deposit", amount, LocalDateTime.now());
        transactionDAO.addTransaction(transaction);
        System.out.println("Deposit successful");
    }
    public void withdraw(long accountNumber, double amount) throws SQLException,AccountNotFoundException,InvalidAmountException,InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than 0");
        }
        double currentBalance = dao.getBalance(accountNumber);
        if(currentBalance>=amount){
            double newBalance=currentBalance-amount;
            dao.updateBalance(accountNumber,newBalance);
            TransactionDAO transactionDAO = new TransactionDAO(con);
            Transaction transaction = new Transaction(0, accountNumber, "Withdrawal", amount, LocalDateTime.now());
            transactionDAO.addTransaction(transaction);
            System.out.println("Withdrawal successful");
        }else {
            throw new InsufficientBalanceException("Insufficient balance");
        }
    }
    public void transfer(long fromAccount, long toAccount, double amount) throws SQLException ,AccountNotFoundException,InvalidAmountException,InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Transfer amount must be greater than 0");
        }
        con.setAutoCommit(false);
        try {
            double fromBalance = dao.getBalance(fromAccount);
            if (fromBalance < amount) {
                throw new InsufficientBalanceException("Insufficient balance");
            }
            double newFromBalance = fromBalance - amount;
            dao.updateBalance(fromAccount, newFromBalance);
            double toBalance = dao.getBalance(toAccount);
            double newToBalance = toBalance + amount;
            dao.updateBalance(toAccount, newToBalance);
            TransactionDAO transactionDAO = new TransactionDAO(con);
            Transaction transaction = new Transaction(0, fromAccount, "Transfer", amount, LocalDateTime.now());
            transactionDAO.addTransaction(transaction);
            con.commit();
            con.setAutoCommit(true);
            System.out.println("Transfer successful");
        }catch (SQLException | AccountNotFoundException | InsufficientBalanceException e) {
            try {
                con.rollback();
                con.setAutoCommit(true);
            } catch (SQLException rollbackException) {
                rollbackException.printStackTrace();
            }

            throw e;
        }
    }
}
