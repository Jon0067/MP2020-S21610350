package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        char mychar = 'D';
        char myScondchar = '\u0040';
        System.out.println(mychar);
        System.out.println(myScondchar);
        char myThirdchar = '\u0049';
        System.out.println(myThirdchar);

        boolean firsbool = true;
        boolean scondbool = false;
        boolean thirdbool = true;

	    String myString = "This is a string";
        System.out.println("My String : "+myString);
        myString = myString +", this is a bonus for you";
        System.out.println("My String Now is : "+myString);
        myString = myString +"\u00A9 2020";
        System.out.println("Update now is : "+myString);

        String myNumString = "50.09";
        System.out.println("40.49"+myNumString);
        int myInt = 10;
        myNumString = myNumString + myInt;
        System.out.println(myNumString);
    }
}
