package app.classes;

import java.util.Scanner;
import java.lang.Math;

public class Kubus {
    private int sisi;
    Scanner sc = new Scanner(System.in);

    public Kubus() {
        System.out.println("\nProgram Menghitung Volume dan Luas Kubus");
        System.out.println("===========================================");
        System.out.print("Masukkan sisi\t: ");
        this.sisi = sc.nextInt();
    }

    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return this.sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public double getVolume() {
        System.out.println("\nVolume = s^3");
        System.out.println("Volume = " + getSisi() + "^3");
        return Math.pow(sisi, 3);
    }

    public double getLuasPermukaan() {
        System.out.println("\nLuas Permukaan = 6 * s^2");
        System.out.println("Luas Permukaan = 6 * " + getSisi() + "^2");
        return 6 * Math.pow(sisi, 2);
    }

    @Override
    public String toString() {
        return "\nProfil kubus : \n" + "Sisi\t= " + getSisi();
    }
}
