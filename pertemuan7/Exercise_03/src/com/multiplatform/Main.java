package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        //NO 1
        int hasil = (int) toMilesPerHour(75.114);
        System.out.println("Hasil No 1 : " +hasil+ " Mile");

        //NO 2
        printConversion(-1);
    }
    //No 1
    public static double toMilesPerHour(double kilometerperhour){
        if(kilometerperhour < 0 ){
            return -1;
        }
        double result = kilometerperhour * 0.621;
        return result;
    }
    //No 2
    public static void printConversion(double kilometerPerHour){
        if(kilometerPerHour < 0){
            System.out.println("Nilai Tidak Valid");
        }
        else{
            double milesPerHour = kilometerPerHour * 0.621;
            System.out.println(+kilometerPerHour+ " km/h = "+milesPerHour+" mi/h");
        }
    }
}
