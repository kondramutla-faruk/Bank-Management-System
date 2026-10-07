package model;
import java.time.LocalDateTime;
public class Transaction{
    private int transactionId;
    private long accountNumber;
    private String transactionType;
    private double amount;
    private LocalDateTime  transactionDateTime;
    public Transaction(int transactionId,long accountNumber,String transactionType,double amount,LocalDateTime transactionDateTime){
        this.transactionId=transactionId;
        this.accountNumber=accountNumber;
        this.transactionType=transactionType;
        this.amount=amount;
         this.transactionDateTime=transactionDateTime;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setTransactionId(int transactionId){
        this.transactionId=transactionId;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public void setTransactionType(String transactionType){
        this.transactionType=transactionType;
    }
    public void setTransactionDateTime(LocalDateTime transactionDateTime){
        this.transactionDateTime=transactionDateTime;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public int getTransactionId(){
        return transactionId;
    }
    public double getAmount(){
        return amount;
    }
    public String getTransactionType(){
        return transactionType;
    }
    public LocalDateTime getTransactionDateTime(){
        return transactionDateTime;
    }
}
