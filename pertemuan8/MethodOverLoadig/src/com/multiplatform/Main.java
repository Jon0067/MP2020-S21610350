package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        //Method OverLoading
        sum(1,22.48,5);
    }
    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }
    public static int sum(int a, double b, int c){
        int result = a + (int)b + c;
        return result;
    }
    public static int sum(int a, int b, int c, int d){
        int result = a + b + c + d;
        return  result;
    }
}
