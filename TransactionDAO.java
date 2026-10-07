package dao;
import java.sql.*;
import model.Transaction;
import util.DBConnection;
public class TransactionDAO {
  private Connection con;

    public TransactionDAO() throws SQLException {
        con = DBConnection.getConnection();
    }
    public TransactionDAO(Connection con){
        this.con=con;
    }

    public void addTransaction(Transaction transaction) throws SQLException {
        try (
                PreparedStatement ps = con.prepareStatement("INSERT INTO Transaction (account_number, transaction_type, amount, transaction_date_time) VALUES (?, ?, ?, ?)")) {
            ps.setLong(1, transaction.getAccountNumber());
            ps.setString(2, transaction.getTransactionType());
            ps.setDouble(3, transaction.getAmount());
            ps.setTimestamp(4, Timestamp.valueOf(transaction.getTransactionDateTime()));
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Transaction added successfully");
            }
        }
    }

    public void getTransactions() throws SQLException {
        try (PreparedStatement ps = con.prepareStatement("SELECT * FROM Transaction");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int transactionId = rs.getInt("transaction_id");
                long accountNumber = rs.getLong("account_number");
                String transactionType = rs.getString("transaction_type");
                double amount = rs.getDouble("amount");
                Timestamp transactionDateTime = rs.getTimestamp("transaction_date_time");
                System.out.println("Transaction ID = " + transactionId);
                System.out.println("Account Number :" + accountNumber);
                System.out.println("Transaction Type = " + transactionType);
                System.out.println("Amount = " + amount);
                System.out.println("Transaction Date & Time = " + transactionDateTime);
                System.out.println("----------------------");
            }
        }
    }
}
