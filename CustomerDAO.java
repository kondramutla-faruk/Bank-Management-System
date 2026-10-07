package dao;
import java.sql.*;
import util.DBConnection;
import model.Customer;
public class CustomerDAO {
   private Connection con;

    public CustomerDAO() throws SQLException {
        con = DBConnection.getConnection();
    }

    public void addCustomer(Customer customer) throws SQLException {
        try (PreparedStatement
                     ps = con.prepareStatement("INSERT INTO Customer (name, mobile_number, email, address) VALUES (?, ?, ?, ?)")) {
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getMobileNumber());
            ps.setString(3, customer.getEmail());
            ps.setString(4, customer.getAddress());
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Customer added successfully");
            }
        }
    }

    public void getCustomers() throws SQLException {
        try (PreparedStatement
                     ps = con.prepareStatement("SELECT * FROM Customer");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int customerId = rs.getInt("customer_id");
                String name = rs.getString("name");
                String mobileNumber = rs.getString("mobile_number");
                String email = rs.getString("email");
                String address = rs.getString("address");
                System.out.println("Customer ID = " + customerId);
                System.out.println("Name = " + name);
                System.out.println("Mobile Number = " + mobileNumber);
                System.out.println("Email = " + email);
                System.out.println("Address = " + address);
                System.out.println("----------------------");
            }
        }
    }
}
