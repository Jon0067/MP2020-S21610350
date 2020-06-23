package com.multiplatform;

public class Wall {
    private double width;
    private double height;

    //Constructor 1
    public Wall(){

    }
    //Constructor 2
    public Wall(double width, double height){
        this.width = width;
        this.height = height;
        if(width > 0 && height < 0){
            width = 0;
        }
        else if(height < 0){
            height = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double setWidth(double width) {
        this.width = width;
        if(width < 0){
            return 0;
        }
        else {
            return width;
        }
    }

    public double setHeight(double height) {
        this.height = height;
        if(height < 0){
            return 0;
        }
        else {
            return height;
        }
    }
    public double getArea(){
        double area = height * width;
        return area;
    }
}
