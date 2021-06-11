package app.classes;

import java.util.Scanner;
import java.lang.Math;

public class Tabung {
    private final float PI = (float) 22 / 7;
    private float radius, height;
    Scanner sc = new Scanner(System.in);

    public Tabung() {
        System.out.println("\nProgram Menghitung Volume dan Luas Tabung");
        System.out.println("===========================================");

        System.out.print("Masukkan jari-jari\t: ");
        this.radius = sc.nextFloat();

        System.out.print("Masukkan tinggi\t\t: ");
        this.height = sc.nextFloat();
    }

    public Tabung(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getVolume() {
        System.out.println("\nVolume = PI * r^2 * h");
        System.out.println("Volume = 22/7 * " + getRadius() + "^2 * " + getHeight());
        return PI * (float) Math.pow(radius, 2) * height;
    }

    public float getLuasPermukaan() {
        System.out.println("\nLuas Permukaan = 2 * PI * r * (r + h)");
        System.out.println(
                "Luas Permukaan = 2 * 22/7 * " + getRadius() + " * (" + getRadius() + " + " + getHeight() + ")");
        return 2 * PI * radius * (radius + height);
    }

    @Override
    public String toString() {
        return "\nProfil tabung : \n" + "Jari-jari\t= " + getRadius() + "\nTinggi\t\t= " + getHeight();
    }

}
