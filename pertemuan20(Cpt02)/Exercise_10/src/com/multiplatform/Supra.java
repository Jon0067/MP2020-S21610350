package com.multiplatform;

public class Supra extends Car{
    public Supra(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getCylinders() {
        return super.getCylinders();
    }

    @Override
    public boolean isEngine() {
        return super.isEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}
