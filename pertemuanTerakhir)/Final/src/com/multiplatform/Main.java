package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        // write your code here
        KipasBiru sanex = new KipasBiru("Sanex",1,"Biru");
        JacketMerah jaks = new JacketMerah("Jacket", 1, "merah");
        JasHitam Jas = new JasHitam("Jass",1,"Hitam");
        LemariHijau lem = new LemariHijau("Lemari",1,"Hijau");
        Room Jon = new Room(sanex, Jas, jaks,lem);

        Jon.tampilan();
        Jon.hide();
    }
}
