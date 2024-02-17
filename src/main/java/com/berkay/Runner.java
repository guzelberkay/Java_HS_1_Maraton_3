package com.berkay;

import com.berkay.entity.HayvanSayisi;
import com.berkay.entity.Kedi;
import com.berkay.entity.Kopek;
import com.berkay.entity.Kus;

public class Runner {
    public static void main(String[] args) {
        Kus kus = new Kus("Muhabbet Kusu", 3, "Erkek");

        Kedi kedi = new Kedi("Tekir", 5, "Disi");

        Kopek kopek = new Kopek("Kangal", 1, "Erkek");



        kus.yemekYe();
        kus.konus();
        kus.uc();
        System.out.println("-----------------------------");
        kedi.yemekYe();
        kedi.konus();
        kedi.kos();
        System.out.println("-----------------------------");
        kopek.yemekYe();
        kopek.konus();
        kopek.kos();
        System.out.println("Toplam hayven sayisi : "+HayvanSayisi.getToplamHayvanSayisi());
    }
}
