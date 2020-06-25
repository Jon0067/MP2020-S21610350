package com.multiplatform;

public class Animal {
    private String nama;
    private int body;
    private int brain;
    private int height;

    public Animal(String nama, int body, int brain, int height) {
        this.nama = nama;
        this.body = body;
        this.brain = brain;
        this.height = height;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public void move(int speed){
        System.out.println("Animal is moving");
    }

    public String getNama() {
        return nama;
    }

    public int getBody() {
        return body;
    }

    public int getBrain() {
        return brain;
    }

    public int getHeight() {
        return height;
    }

}
