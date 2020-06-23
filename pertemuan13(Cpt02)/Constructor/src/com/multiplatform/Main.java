package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Account johnakun = new Account("111111",200.0,"John","Jon@gmail.com","123478");
        System.out.println("Customer Name : "+johnakun.getCustomerName());
        System.out.println("Balance : "+johnakun.getBalance());
        johnakun.deposit(50.0);
        System.out.println("Balance : "+johnakun.getBalance());
        johnakun.widthdrawal(155.0);

        Account bobakun = new Account();
        System.out.println("Customer Name : "+bobakun.getCustomerName());
        System.out.println("Balance : "+bobakun.getBalance());

        Account mikes = new Account("Mike","Mike@gmail.com","123456");
        System.out.println("Customer Name : "+mikes.getCustomerName());
        System.out.println("Balance : "+mikes.getBalance());
    }
}
