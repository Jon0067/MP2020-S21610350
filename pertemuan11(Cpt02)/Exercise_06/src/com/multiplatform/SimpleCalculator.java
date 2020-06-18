package com.multiplatform;

public class SimpleCalculator {
    //Field
    private double firstNumber, secondNumber;
    //method
    //01
    public double getFirstNumber (){
        return this.firstNumber;
    }
    //02
    public double getSecondNumber(){
        return this.secondNumber;
    }
    //03
    public double setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
        return firstNumber;
    }
    //04
    public double setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
        return secondNumber;
    }
    //05
    public double getAdditionResult(){
        double total1 = firstNumber + secondNumber;
        return total1;
    }
    //06
    public double getSubtractionResult(){
        double total2 = firstNumber - secondNumber;
        return total2;
    }
    //07
    public double getMultiplicationResult(){
        double total3 = firstNumber * secondNumber;
        return total3;
    }
    //08
    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }
        else {
            double total4 = firstNumber / secondNumber;
            return total4;
        }
    }

}
