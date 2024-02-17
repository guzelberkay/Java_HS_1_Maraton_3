package com.berkay.entity;

public class Kedi extends Hayvan implements Kos{
    public Kedi(String ad, int yas, String cins) {
        super(ad, yas, cins);
    }

    @Override
    public void konus() {
        System.out.println("Miyav Miyav Miyav !!!!");
    }

    @Override
    public void yemekYe() {
        System.out.println("Kedi mamasini yiyor.");
    }

    @Override
    public void uyu() {
        System.out.println("Kedi uyuyor.");
    }

    @Override
    public void hareketEt() {
        System.out.println("Kedi kosuyor.");
    }

    @Override
    public void kos() {
        System.out.println("Kedi kosuyor.");
    }


}
