package app;

import java.util.Scanner;
import app.Tabung;

public class App {
    public static void main(String[] args) throws Exception {
        float r, h;

        Tabung tabung = new Tabung();

        System.out.println("Program Menghitung Volume dan Luas Tabung");
        System.out.println("===========================================");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari\t: ");
        r = scanner.nextFloat();
        tabung.setRadius(r);

        System.out.print("Masukkan tinggi\t\t: ");
        h = scanner.nextFloat();
        tabung.setHeight(h);

        scanner.close();

        System.out.println("\nVolume = PI * r^2 * h");
        System.out.println("Volume = 22/7 * " + r + "^2 * " + h);
        System.out.println("Volume = " + tabung.volume());

        System.out.println("\nLuas Permukaan = 2 * PI * r * (r + h)");
        System.out.println("Luas Permukaan = 2 * 22/7 * " + r + " * (" + r + " + " + h + ")");
        System.out.println("Luas Permukaan = " + tabung.luasPermukaan());

    }
}
