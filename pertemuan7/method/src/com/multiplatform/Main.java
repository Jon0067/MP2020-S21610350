package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	    printMessage("John");
	    int res = addition(1, 3);
        System.out.println("Result = "+res);
    }
    private static void printMessage(String name) {
        System.out.println("Hello "+name);
    }
    private static int addition(int a, int b) {
        if(a == 0 && b == 0){
            return -1;
        }
        int result = a + b;
        return result;
    }
}