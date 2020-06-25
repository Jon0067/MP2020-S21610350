package com.multiplatform;

public class Fish extends Animal{
    private int eyes;
    private int fins;

    public Fish(String nama, int body, int brain, int height, int eyes, int fins) {
        super(nama,1,1,height);
        this.eyes = eyes;
        this.fins = fins;
    }

    @Override
    public void eat() {
        System.out.println(getNama()+" Is eating");
    }

    private void swim(){
        System.out.println(getNama()+" Is swiming");
    }

    @Override
    public void sleep() {
        System.out.println(getNama()+" Is Resting");
    }

    public int getEyes() {
        return eyes;
    }

    public int getFins() {
        return fins;
    }
}
