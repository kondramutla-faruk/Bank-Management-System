package test;
import java.util.Scanner;
import java.time.LocalDateTime;
import model.Transaction;
public class TransactionTest{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Transaction ID :");
        int  transactionId=sc.nextInt();
        System.out.println("Enter the Account Number :");
         long accountNumber=sc.nextLong();
         System.out.println("Enter the Transaction Type :");
         String transactionType=sc.next();
         System.out.println("Enter the Amount :");
         double amount=sc.nextDouble();
         LocalDateTime transactionDateTime=LocalDateTime.now();
        Transaction transaction = new Transaction(transactionId, accountNumber, transactionType, amount, transactionDateTime);
        System.out.println("Transaction ID = " + transaction.getTransactionId());
        System.out.println("Account Number = " + transaction.getAccountNumber());
        System.out.println("Transaction Type = " + transaction.getTransactionType());
        System.out.println("Amount = " + transaction.getAmount());
        System.out.println("Transaction Date & Time = " + transaction.getTransactionDateTime());
        sc.close();
    }
}
