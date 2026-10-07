package service;
import dao.CustomerDAO;
import java.sql.*;
import model.Customer;
public class CustomerService{
  private  CustomerDAO dao;
    public CustomerService() throws SQLException{
        dao=new CustomerDAO();
    }
    public void addCustomer(Customer customer) throws SQLException {
dao.addCustomer(customer);
    }
    public void getCustomers() throws SQLException{
        dao.getCustomers();
    }
}
