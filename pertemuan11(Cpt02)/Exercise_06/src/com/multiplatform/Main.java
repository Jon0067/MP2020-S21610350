package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SimpleCalculator calci = new SimpleCalculator();
        calci.setFirstNumber(5.0);
        calci.setSecondNumber(4);
        System.out.println("Add = "+calci.getAdditionResult());
        System.out.println("Substrack = "+calci.getSubtractionResult());
        calci.setFirstNumber(5.25);
        calci.setSecondNumber(0);
        System.out.println("multi = "+calci.getMultiplicationResult());
        System.out.println("devide = "+calci.getDivisionResult());
    }
}