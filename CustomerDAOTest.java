package test;
import java.util.Scanner;
import java.sql.*;
import model.Customer;
import dao.CustomerDAO;
public class CustomerDAOTest{
    public static void main(String[]args) throws SQLException{
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter Customer Name :");
        String name=sc.nextLine();
        System.out.print("Enter Mobile Number: ");
        String mobileNumber = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        Customer customer = new Customer(1, name, mobileNumber, email, address);
        CustomerDAO dao = new CustomerDAO();
      //  dao.addCustomer(customer);
        sc.close();
    }
}
