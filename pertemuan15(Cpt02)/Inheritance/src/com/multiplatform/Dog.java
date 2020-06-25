package com.multiplatform;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;

    public Dog(String nama, int body, int brain, int height,int eyes, int legs,int tail) {
        super(nama, body, brain, height);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
    }

    @Override
    public void eat() {
        System.out.println( getNama()+" Is eating");
    }

    @Override
    public void sleep() {
        System.out.println(getNama()+" Is Sleeping");
    }
    private void walk(int speed){
        System.out.println(getNama()+" Is walking with speed "+speed);
    }
    private void run(int speed){
        System.out.println(getNama()+" Is Running with speed "+speed);
    }

    @Override
    public void move(int speed) {
        if(speed <= 5){
            this.walk(speed);
        }
        else{
            this.run(speed);
        }
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }
}
