package com.multiplatform;

public class PC {
    private  Monitor theMonitor;
    private Motherboard theMotherboard;
    private Case thecase;

    public PC(Monitor theMonitor, Motherboard theMotherboard, Case thecase) {
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
        this.thecase = thecase;
    }

    public void startPC(String programerName){
        thecase.pressButon();
        theMotherboard.loadProgram("W O P");
        theMonitor.drawPixelAt(2,10,"green");
    }
}
