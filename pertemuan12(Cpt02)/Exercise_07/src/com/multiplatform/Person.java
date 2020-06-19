package com.multiplatform;

public class Person {
    private String firstName, lastName;
    private int age;

    //01
    public String getFirstName(){
        return this.firstName;
    }
    //02
    public String getLastName(){
        return this.lastName;
    }
    //03
    public int getAge(){
        return this.age;
    }
    //04
    public String setFirstName(String firstName){
        this.firstName = firstName;
        return firstName;
    }
    //05
    public String setLastName(String lastName){
        this.lastName = lastName;
        return lastName;
    }
    //06
    public int setAge(int age){
        this.age = age;
        if (age < 0 || age > 100){
            return 0;
        }
        else {
            return age;
        }
    }
    //07
    public boolean IsTeen(){
        if(age < 20 && age > 12){
            return true;
        }
        else{
            return false;
        }
    }
    //08
    public String getFullName(){
        String full = firstName + lastName;
        return full;
    }
}
