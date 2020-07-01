package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Case OldTown = new Case("T-500","Ziborg","3000");
        Motherboard ROG = new Motherboard("R-700","I7",4,1,"Intel");
        Monitor Sharp = new Monitor("The newestt","Updated Verson",1080,new Resolution(1080,1920));

        PC Oldbuddies = new PC(Sharp,ROG, OldTown);
        Oldbuddies.startPC("Bedeehhhh");
    }
}
