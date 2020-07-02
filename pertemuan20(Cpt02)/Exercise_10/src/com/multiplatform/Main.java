package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car Truck = new Car("Truck",2);
        Car supra = new Supra("Supra",4);
        Car Mitshubishi = new Eclipse("Eclipse",3);
        Car Ford = new Mustang("Mustang",8);

        Truck.accelerate();
        supra.accelerate();
        Mitshubishi.startEngine(true);
        Ford.brake();
    }
}