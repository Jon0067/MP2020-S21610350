package com.multiplatform;

public class KipasBiru{
    private String nama;
    private int jumlah;
    private String warna;

    public KipasBiru(String nama, int jumlah, String warna) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.warna = warna;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getWarna() {
        return warna;
    }
    
    public void Objectkipass(String nama, int jumlah, String warna){
        System.out.println("Object dengan nama "+nama+ " dengan jumlah "+jumlah+" dan warna "+warna);
    }
}
