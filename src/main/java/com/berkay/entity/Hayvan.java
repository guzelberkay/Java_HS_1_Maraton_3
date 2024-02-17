package com.berkay.entity;

import java.util.SortedMap;

public class Hayvan {
    private final String ad;
    private int yas;
    private final String cins;



    public Hayvan(String ad, int yas, String cins) {
        this.ad = ad;
        this.yas = yas;
        this.cins = cins;
        HayvanSayisi.hayvanEklendi(); // her yeni hayvanı eklediğimizde sayacı arttır.
    }

    public String getAd() {
        return ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getCins() {
        return cins;
    }
    public void konus(){
        System.out.println("Hayvan konusuyor.");
    }
    public void yemekYe(){
        System.out.println("Hayvan yemek yiyor.");
    }
    public void uyu(){
        System.out.println("Hayvan uyuyor.");
    }
    public void hareketEt(){
        System.out.println("Hayvan hareket ediyor.");
    }
}


