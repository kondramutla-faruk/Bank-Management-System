package test;
import java.util.Scanner;
import model.SavingsAccount;
import model.CurrentAccount;
public class AccountTypeTest{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Account Number : ");
        long accountNumber=sc.nextLong();
        System.out.println("Enter the Customer Id :");
        int customerId=sc.nextInt();
        System.out.println("Enter the Balance :");
        double balance=sc.nextDouble();
        System.out.println("Enter the Account Type :");
        String accountType=sc.next();
        System.out.println(" Savings Account :");
        SavingsAccount savings=new SavingsAccount( accountNumber,customerId, balance, accountType);
        System.out.println("Account Number :"+savings.getAccountNumber());
        System.out.println("Customer Id :"+savings.getCustomerId());
        System.out.println("Balance :"+savings.getBalance());
        System.out.println("Account Type :"+savings.getAccountType());
        System.out.println(" Current Account :");
        CurrentAccount currentAccount = new CurrentAccount(accountNumber, customerId, balance, accountType);
        System.out.println("Account Number = " + currentAccount.getAccountNumber());
        System.out.println("Customer ID = " + currentAccount.getCustomerId());
        System.out.println("Balance = " + currentAccount.getBalance());
        System.out.println("Account Type = " + currentAccount.getAccountType());
        sc.close();
    }
}
