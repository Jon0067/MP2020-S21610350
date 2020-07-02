package com.multiplatform;

import javax.xml.namespace.QName;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine(boolean engine){
        if(engine == true){
            System.out.println(name+" Engine is Running");
        }
        else{
            System.out.println(name+" Engine is Running");
        }
    }

    public void accelerate(){
        System.out.println(name+" speed is increasing... fast");
    }

    public void brake(){
        System.out.println(name+" about to going to stop");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}
