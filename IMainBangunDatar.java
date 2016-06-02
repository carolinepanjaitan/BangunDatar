package com.bangundatar.interfes;

public class IMainBangunDatar {
    public static void main(String[] args) {
    IPolymorp poly = new IPolymorp();
    poly.poly(new IPersegi());
    poly.poly(new IPersegiPanjang());
    poly.poly(new ISegitiga());
    poly.poly(new JajarGenjang());
    poly.poly(new Balok());
    }
}
