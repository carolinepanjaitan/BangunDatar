package com.bangundatar.interfes;

import java.util.Scanner;

public class IPersegi implements IBangunDatar{
    int luas, keliling, sisi;

    public IPersegi(int luas, int keliling, int sisi) {
        this.luas = luas;
        this.keliling = keliling;
        this.sisi = sisi;
    }

    IPersegi() {
        
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public int getKeliling() {
        return keliling;
    }

    public void setKeliling(int keliling) {
        this.keliling = keliling;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        
        System.out.println("Masukkan nilai sisi1: ");
        Scanner sc = new Scanner(System.in);
        int sisi = sc.nextInt();
        luas = sisi * sisi;
        System.out.println("Luas Persegi:" + " " +luas);
    }

    @Override
    public void hitungKeliling() {
        System.out.println("Masukkan nilai sisi: ");
        Scanner sc = new Scanner(System.in);
        int sisi = sc.nextInt();
        keliling = 4 * sisi;
        System.out.println("Keliling Persegi:" + " " +keliling); 
    }

    @Override
    public void volume() {
        
    }
    
    
}
