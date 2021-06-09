package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float r, h;
        char confirm;
        int pilihan;
        int s, p, l, t;

        Tabung tabung = new Tabung();
        Balok balok = new Balok();
        Kubus kubus = new Kubus();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Menu pilih : ");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("0. Exit");
            System.out.print("Anda memilih : ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nProgram Menghitung Volume dan Luas Kubus");
                    System.out.println("===========================================");

                    System.out.print("Masukkan sisi\t: ");
                    s = scanner.nextInt();
                    kubus.setSisi(s);

                    System.out.println("\nVolume = s^3");
                    System.out.println("Volume = " + s + "^3");
                    System.out.println("Volume = " + kubus.volume());

                    System.out.println("\nLuas Permukaan = 6 * s^2");
                    System.out.println("Luas Permukaan = 6 * " + s + "^2");
                    System.out.println("Luas Permukaan = " + kubus.luasPermukaan());

                    break;

                case 2:
                    System.out.println("\nProgram Menghitung Volume dan Luas Balok");
                    System.out.println("===========================================");

                    System.out.print("Masukkan panjang\t: ");
                    p = scanner.nextInt();
                    balok.setPanjang(p);

                    System.out.print("Masukkan lebar\t\t: ");
                    l = scanner.nextInt();
                    balok.setLebar(l);

                    System.out.print("Masukkan tinggi\t\t: ");
                    t = scanner.nextInt();
                    balok.setTinggi(t);

                    System.out.println("\nVolume = p * l * t");
                    System.out.println("Volume = " + p + " * " + l + " * " + t);
                    System.out.println("Volume = " + balok.volume());

                    System.out.println("\nLuas Permukaan = 2 * (p * l + p * t + l * t)");
                    System.out.println("Luas Permukaan = 2 * (" + p + " * " + l + " + " + p + " * " + t + " + " + l
                            + " * " + t + ")");
                    System.out.println("Luas permukaan = " + balok.luasPermukaan());

                    break;

                case 3:
                    System.out.println("\nProgram Menghitung Volume dan Luas Tabung");
                    System.out.println("===========================================");

                    System.out.print("Masukkan jari-jari\t: ");
                    r = scanner.nextFloat();
                    tabung.setRadius(r);

                    System.out.print("Masukkan tinggi\t\t: ");
                    h = scanner.nextFloat();
                    tabung.setHeight(h);

                    System.out.println("\nVolume = PI * r^2 * h");
                    System.out.println("Volume = 22/7 * " + r + "^2 * " + h);
                    System.out.println("Volume = " + tabung.volume());

                    System.out.println("\nLuas Permukaan = 2 * PI * r * (r + h)");
                    System.out.println("Luas Permukaan = 2 * 22/7 * " + r + " * (" + r + " + " + h + ")");
                    System.out.println("Luas Permukaan = " + tabung.luasPermukaan());

                    break;

                case 0:
                    System.out.println("Terima kasih...");
                    System.exit(0);

                default:
                    System.out.println("Anda memasukkan nomor yang salah...");
            }

            System.out.print("\nUlangi (y/n)? ");
            scanner.nextLine();
            String yesno = scanner.nextLine();
            confirm = yesno.charAt(0);
            System.out.println();
        } while (confirm == 'y' || confirm == 'Y');

        System.out.println("Terima Kasih...");

        scanner.close();
    }
}
