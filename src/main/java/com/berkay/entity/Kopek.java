package com.berkay.entity;

public class Kopek extends Hayvan implements Kos {
    public Kopek(String ad, int yas, String cins) {
        super(ad, yas, cins);
    }

    @Override
    public void konus() {
        System.out.println("Hav Hav Hav!!!");
    }

    @Override
    public void yemekYe() {
        System.out.println("Kopek mamasini yiyor.");
    }

    @Override
    public void uyu() {
        System.out.println("Kopek uyuyor.");
    }

    public void kos() {
        System.out.println("Kopek kosuyor.");
    }

    @Override
    public void hareketEt() {
        System.out.println("Kopek kosuyor.");
    }
}
