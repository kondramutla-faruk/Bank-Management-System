package test;
import java.util.Scanner;
import model.Account;
public class AccountTest{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Number:");
        long accountNumber =sc.nextLong();
        System.out.println("Enter Customer Id:");
        int customerId=sc.nextInt();
        System.out.println("Enter Balance :");
        double balance =sc.nextDouble();
        System.out.println("Enter AccountType :");
        String accountType =sc.next();
        Account account=new Account( accountNumber,customerId, balance, accountType);
        System.out.println("Account Number :"+account.getAccountNumber());
        System.out.println("Customer Id :"+account.getCustomerId());
        System.out.println("Balance :"+account.getBalance());
        System.out.println("Account Type :"+account.getAccountType());
        sc.close();
    }
}
