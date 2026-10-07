package model;
public class Customer{
    private int customerId;
    private String name;
    private String mobileNumber;
    private String email;
    private String address;
    public Customer(int customerId,String name,String mobileNumber,String email,String address){
        this.customerId=customerId;
        this.name=name;
        this.mobileNumber=mobileNumber;
        this.email=email;
        this.address=address;
    }
    public void setCustomerId(int customerId){
        this.customerId=customerId;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMobileNumber(String mobileNumber){
        this.mobileNumber=mobileNumber;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public int getCustomerId(){
        return customerId;
    }
    public String getName(){
        return name;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress(){
        return address;
    }
}
