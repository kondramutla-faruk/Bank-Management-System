package model;
public class Account{
    private long accountNumber;
    private int customerId;
    private double balance;
    private String accountType;
    public Account(long accountNumber,int customerId,double balance,String accountType){
        this.accountNumber=accountNumber;
        this.customerId=customerId;
        this.balance=balance;
        this.accountType=accountType;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setCustomerId(int customerId){
        this.customerId=customerId;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setAccountType(String accountType){
        this.accountType=accountType;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public int getCustomerId(){
        return customerId;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountType(){
        return accountType;
    }
}
