package com.multiplatform;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    //construtor
    public Account (){
        this("9999999",0.0,"Default Name","Default Email","Default phone Number");
    }
    public Account (String number, double balance,String customerName,String emailAddress,String phoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String emailAddress, String phoneNumber){
        this("9999999",0.0,customerName,emailAddress,phoneNumber);
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposit fo "+amount+ "made.New balance is "+this.balance);
    }
    
    public void widthdrawal(double amount){
        if(this.balance - amount < 0){
            System.out.println("Insufficient funds. withdrawal not process");
        }
        else{
            this.balance -= amount;
            System.out.println("Widrawal of "+amount+" proceess, Remaining balance is "+this.balance);
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
