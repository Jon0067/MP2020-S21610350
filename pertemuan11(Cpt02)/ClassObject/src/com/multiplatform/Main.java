package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	    //Class & Object
        Car toyota = new Car();
        toyota.setModel("Ayla");
        System.out.println("Model is "+toyota.getModel());

        Car mitsubhisi = new Car();
        mitsubhisi.setModel("Eclipse");
        System.out.println("Best one is : "+mitsubhisi.getModel());

        Car sht = new Car();
        sht.setModel("Blebla");
        System.out.println("This is : "+sht);
    }
}