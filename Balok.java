package com.bangundatar.interfes;

import java.util.Scanner;

public class Balok implements IBangunDatar {
    int luas, volume, panjang, lebar, tinggi;

    public Balok(int luas, int volume, int panjang, int lebar, int tinggi) {
        this.luas = luas;
        this.volume = volume;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    Balok() {
        
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public void hitungLuas() {
        System.out.println("Masukkan nilai panjang: ");
        Scanner sc = new Scanner(System.in);
        int panjang = sc.nextInt();
        
        System.out.println("Masukkan nilai lebar: ");
        Scanner sb = new Scanner(System.in);
        int lebar = sb.nextInt();
        
        System.out.println("Masukkan nilai tinggi: ");
        Scanner sd = new Scanner(System.in);
        int tinggi = sd.nextInt();
        
        luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        System.out.println("Luas Balok adalah " +luas);
    }

    @Override
    public void hitungKeliling() {
        
    }

    @Override
    public void volume() {
        System.out.println("Masukkan nilai panjang: ");
        Scanner sc = new Scanner(System.in);
        int panjang = sc.nextInt();
        
        System.out.println("Masukkan nilai lebar: ");
        Scanner sb = new Scanner(System.in);
        int lebar = sb.nextInt();
        
        System.out.println("Masukkan nilai tinggi: ");
        Scanner sd = new Scanner(System.in);
        int tinggi = sd.nextInt();
        
        volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok adalah " +volume);
    }
    
}
