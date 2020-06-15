package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //No 1
        System.out.println("<<<<<<<<<<<<<<<<<<<No 1>>>>>>>>>>>>>>>>>>>\n"+area(5.0));
        System.out.println(area(-1));
        //No 2
        System.out.println(">>>>>>>>>>>>>>>>>>No 2<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(+area(5.0,4.0));
        System.out.println(area(-1.0,4.0));


    }
    public static double area(double radius){
        if (radius < 0){
            System.out.println("since the parameter is negative ");
            return -1.0;
        }
        else{
            double Pi = 3.14;
            double total = radius * radius * Pi;
            return total;
        }
    }
    public  static double area( double x, double y){
        if( x < 0 || y <0){
            System.out.println("since the parameter is negative ");
            return -1.0;
        }
        else{
            double z = x * y;
            System.out.println("("+x+" * "+y+" = "+z+")");
            return  z;
        }
    }
}
