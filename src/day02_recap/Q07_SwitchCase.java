package day02_recap;

import java.util.Scanner;

public class Q07_SwitchCase {
    public static void main(String[] args) {

         /*
            gunleri gösterebilen bir program yazın
            gun Pazartesi veya Sali ise:
            Java dersi gunleri

            gun Persembe veya Cuma ise:
            Selenyum dersi gunleri

            gun carsamba veya cumartesi ise:
            SQL dersi gunleri

            aksi halde: izin gunu
            (if deyimini KULLANMAYIN)
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("gunu giriniz");
        String gun = scan.nextLine().toLowerCase();

        switch (gun) {
            case "pazartesi":
            case "sali":
                System.out.println("Java dersi gunleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum dersi gunleri");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("SQL dersi gunleri");
                break;
            default:
                System.out.println("izin gunu");
        }


    }


}
