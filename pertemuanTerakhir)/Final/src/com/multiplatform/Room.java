package com.multiplatform;

public class Room {
    private KipasBiru kipas;
    private JasHitam Jas;
    private JacketMerah Jakcet;
    private LemariHijau lemari;

    public Room(KipasBiru kipas, JasHitam jas, JacketMerah jakcet, LemariHijau lemari) {
        this.kipas = kipas;
        this.Jas = jas;
        this.Jakcet = jakcet;
        this.lemari = lemari;
    }

    public void tampilan(){
        System.out.println("Ruangan ini milik Jon");
        kipas.Objectkipass("Kipas Angin Sanex",1,"Biru");
        Jas.ObjectJass("Jass",2,"Hitam");
        Jakcet.ObjectJaket("Jacket",1,"Merah");
        lemari.ObjectLemari("Lemari",1,"Hijau");
    }
    public void hide(){
        System.out.println("Ruangan ini milik Jon");
        System.out.println("\n\nObject2nya telah disembunyikan");
    }

}
