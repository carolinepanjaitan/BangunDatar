package com.bangundatar.interfes;

import java.util.Scanner;

public class JajarGenjang implements IBangunDatar {
    int keliling, luas, alas, tinggi, ab, bc, cd, ad;

    public JajarGenjang(int keliling, int luas, int alas, int tinggi, int ab, int bc, int cd, int ad) {
        this.keliling = keliling;
        this.luas = luas;
        this.alas = alas;
        this.tinggi = tinggi;
        this.ab = ab;
        this.bc = bc;
        this.cd = cd;
        this.ad = ad;
    }

    JajarGenjang() {
        
    }

    public int getKeliling() {
        return keliling;
    }

    public void setKeliling(int keliling) {
        this.keliling = keliling;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getAb() {
        return ab;
    }

    public void setAb(int ab) {
        this.ab = ab;
    }

    public int getBc() {
        return bc;
    }

    public void setBc(int bc) {
        this.bc = bc;
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    @Override
    public void hitungLuas() {
        System.out.println("Masukkan nilai alas: "); 
        Scanner sc = new Scanner(System.in);
        int alas = sc.nextInt();
        
        System.out.println("Masukkan nilai tinggi: "); 
        Scanner ss = new Scanner(System.in);
        int tinggi = ss.nextInt();
        luas = alas * tinggi;
        System.out.println("Luas Jajargenjang adalah " +luas);
    }

    @Override
    public void hitungKeliling() {
        System.out.println("Masukkan nilai ab: "); 
        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt();
        
        System.out.println("Masukkan nilai bc: "); 
        Scanner sd = new Scanner(System.in);
        int bc = sd.nextInt();
        
        System.out.println("Masukkan nilai cd: "); 
        Scanner sb = new Scanner(System.in);
        int cd = sb.nextInt();
        
        System.out.println("Masukkan nilai ad: "); 
        Scanner ss = new Scanner(System.in);
        int ad = ss.nextInt();
        keliling = ab + bc + cd + ad;
        System.out.println("Keliling Jajargenjang adalah " +keliling);
    }

    @Override
    public void volume() {
        
    }
    
}
