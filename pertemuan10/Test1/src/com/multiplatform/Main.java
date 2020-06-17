package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        //No 1
        shoulddWakeUp(true,1);
        shoulddWakeUp(false,2);
        shoulddWakeUp(true,8);
        shoulddWakeUp(true,-1);


        //No 2
        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);

    }
    //No 1
    public static boolean shoulddWakeUp(boolean barking, int hourOfDay){
        if(barking == true){
            if((hourOfDay > 0 & hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 24)){
                return true;
            }
            else {
                System.out.println("Since the hourOfDay parameter needs to be in a range 0-23");
                return false;
            }
        }
        else{
            System.out.println("Since the Dog is not Barking");
            return false;
        }

    }
    //No 2
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(temperature < 25){
            return false;
        }
        else {
            return true;
        }
    }
}
