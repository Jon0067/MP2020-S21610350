package com.multiplatform;

public class Car {
    //2 member dalam class
    //1. field
    //2. method
    private String model;
    private int doors;
    private int wheels;
    private String engine;

    //Set
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("ayla")||validModel.equals(("eclipse"))){
            this.model = model;
        }else{
            this.model = "Unknown Player";
        }
    }
    //Get
    public String getModel(){
        return this.model;
    }

}
