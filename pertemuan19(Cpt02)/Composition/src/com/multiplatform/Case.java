package com.multiplatform;

public class Case {
    private String model;
    private String manufacture;
    private String powerSupply;

    public Case(String model, String manufacture, String powerSupply) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
    }

    public void pressButon(){
        System.out.println("Power button is pressed.....");
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getPowerSupply() {
        return powerSupply;
    }
}
