package com.berkay.entity;

public class HayvanSayisi {
    private static int toplamHayvanSayisi = 0;

    public static void hayvanEklendi(){
        toplamHayvanSayisi++;
    }

    public static int getToplamHayvanSayisi() {
        return toplamHayvanSayisi;
    }
}
