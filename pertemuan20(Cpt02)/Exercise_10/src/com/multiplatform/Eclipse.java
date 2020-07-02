package com.multiplatform;

public class Eclipse extends Car{
    public Eclipse(String name, int cylinders) {
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
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void startEngine(boolean engine) {
        super.startEngine(engine);
    }

    @Override
    public void brake() {
        super.brake();
    }
}
