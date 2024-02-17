package com.berkay.entity;

import java.util.SortedMap;

public class Kus extends Hayvan implements Uc{

    public Kus(String ad, int yas, String cins) {
        super(ad, yas, cins);
    }

    @Override
    public void konus() {
        System.out.println("Cik Cik Cik !!!");
    }

    @Override
    public void yemekYe() {
        System.out.println("Kus yemek yiyiyor");
    }

    @Override
    public void uyu() {
        System.out.println("Kus uyuyor.");;
    }

    public void uc() {
        System.out.println("Kus ucuyor.");
    }

    @Override
    public void hareketEt() {
        System.out.println("Kus ucuyor.");
    }
}
