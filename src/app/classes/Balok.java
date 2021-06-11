package app.classes;

import java.util.Scanner;

public class Balok {
    private int panjang, lebar, tinggi;
    Scanner sc = new Scanner(System.in);

    public Balok() {
        System.out.println("\nProgram Menghitung Volume dan Luas Balok");
        System.out.println("===========================================");
        System.out.print("Masukkan panjang\t: ");
        this.panjang = sc.nextInt();
        System.out.print("Masukkan lebar\t\t: ");
        this.lebar = sc.nextInt();
        System.out.print("Masukkan tinggi\t\t: ");
        this.tinggi = sc.nextInt();
    }

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int getPanjang() {
        return this.panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return this.lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getVolume() {
        System.out.println("\nVolume = p * l * t");
        System.out.println("Volume = " + getPanjang() + " * " + getLebar() + " * " + getTinggi());
        return panjang * lebar * tinggi;
    }

    public int getLuasPermukaan() {
        System.out.println("\nLuas Permukaan = 2 * (p * l + p * t + l * t)");
        System.out.println("Luas Permukaan = 2 * (" + getPanjang() + " * " + getLebar() + " + " + getPanjang() + " * "
                + getTinggi() + " + " + getLebar() + " * " + getTinggi() + ")");
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    @Override
    public String toString() {
        return "\nProfil balok : \n" + "Panjang\t= " + getPanjang() + "\nLebar\t= " + getLebar() + "\nTinggi\t= "
                + getTinggi();
    }

}
