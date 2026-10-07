package dao;
import java.sql.*;
import exception.*;
import model.Account;
import util.DBConnection;
public class AccountDAO {
   private Connection con;

    public AccountDAO() throws SQLException {
        con = DBConnection.getConnection();
    }
    public AccountDAO(Connection con){
        this.con=con;
    }

    public void addAccount(Account account) throws SQLException {
        try (PreparedStatement ps = con.prepareStatement(
                "INSERT INTO Account (account_number, customer_id, balance, account_type) VALUES (?, ?, ?, ?)"
        )) {
            ps.setLong(1, account.getAccountNumber());
            ps.setInt(2, account.getCustomerId());
            ps.setDouble(3, account.getBalance());
            ps.setString(4, account.getAccountType());
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Account added successfully");
            }
        }
    }

    public void getAccounts() throws SQLException {
        try (PreparedStatement ps = con.prepareStatement("SELECT * FROM Account");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                long accountNumber = rs.getLong("account_number");
                int customerId = rs.getInt("customer_id");
                double balance = rs.getDouble("balance");
                String accountType = rs.getString("account_type");
                System.out.println("Account Number = " + accountNumber);
                System.out.println("Customer ID = " + customerId);
                System.out.println("Balance = " + balance);
                System.out.println("Account Type = " + accountType);
                System.out.println("----------------------");
            }
        }
    }

    public double getBalance(long accountNumber) throws SQLException, AccountNotFoundException {
        try (PreparedStatement ps = con.prepareStatement(
                "SELECT balance FROM Account WHERE account_number = ?"
        )) {
            ps.setLong(1, accountNumber);
            try (
                    ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    double balance = rs.getDouble("balance");
                    return balance;
                }
                throw new AccountNotFoundException("Account not found");
            }
            }
        }

        public void updateBalance ( long accountNumber, double newBalance) throws SQLException {
            try (PreparedStatement ps = con.prepareStatement(
                    "UPDATE Account SET balance = ? WHERE account_number = ?")) {
                ps.setDouble(1, newBalance);
                ps.setLong(2, accountNumber);
                int rows = ps.executeUpdate();
                if (rows > 0) {
                    System.out.println("Balance updated successfully");
                }
            }
        }
    }


