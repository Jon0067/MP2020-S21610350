package com.multiplatform;

public class Main {
        public static void main(String[] args) {
                int myIntValue = 10000;
                byte myBytevalue = 100;
                short myShortvalue = 200;
                long myLongvalue = 50000 + 10 * myBytevalue + myShortvalue + myIntValue;

                System.out.println("The Value Is = " + myLongvalue);
        }
}
