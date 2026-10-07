package test;
import java.util.Scanner;
import model.Customer;
public class CustomerTest{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer Name :");
        String name=sc.nextLine();
        System.out.println("Enter Mobile Number :");
        String mobileNumber=sc.nextLine();
        System.out.println("Enter Email :");
        String email=sc.nextLine();
        System.out.println("Enter Address :");
        String address=sc.nextLine();
        Customer customer=new Customer(1,name, mobileNumber,email, address);
        System.out.println("Customer Id :"+customer.getCustomerId());
        System.out.println("Customer Name :"+customer.getName());
        System.out.println("Customer Mobile Number :"+customer.getMobileNumber());
        System.out.println("Customer E-mail :"+customer.getEmail());
        System.out.println("Customer Address :"+customer.getAddress());
        sc.close();
    }
}
