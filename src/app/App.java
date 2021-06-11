package app;

import java.util.Scanner;
import app.classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        char confirm;
        int pilihan;
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
                    // pilih kubus
                    Kubus kubus = new Kubus();
                    System.out.println(kubus.toString());
                    System.out.println("Volume = " + kubus.getVolume());
                    System.out.println("Luas Permukaan = " + kubus.getLuasPermukaan());
                    break;

                case 2:
                    // pilih balok
                    Balok balok = new Balok();
                    System.out.println(balok.toString());
                    System.out.println("Volume = " + balok.getVolume());
                    System.out.println("Luas permukaan = " + balok.getLuasPermukaan());
                    break;

                case 3:
                    // pilih tabung
                    Tabung tabung = new Tabung();
                    System.out.println(tabung.toString());
                    System.out.println("Volume = " + tabung.getVolume());
                    System.out.println("Luas Permukaan = " + tabung.getLuasPermukaan());
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
