package com.multiplatform;

public class Motherboard {
    private String model;
    private String manufarcture;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufarcture, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufarcture = manufarcture;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String progameName){
        System.out.println("Program "+progameName+ "Is Running");
    }

    public String getModel() {
        return model;
    }

    public String getManufarcture() {
        return manufarcture;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
