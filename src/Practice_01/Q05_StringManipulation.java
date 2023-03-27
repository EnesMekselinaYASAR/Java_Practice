package Practice_01;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin
        // ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Isim ve soyisim giriniz: \nisim:");
        String isim=scan.nextLine();
        System.out.println("Soyisim");
        String soyIsim= scan.nextLine();

        if (isim.length()>soyIsim.length()){
            System.out.println("Isminiz soyisminizden uzun");
        }else if (isim.length()==soyIsim.length()){
            System.out.println("Isminiz ile soyisminiz eşit uzunlukta");
        }else System.out.println("Soyisminiz isminizden uzun");




    }
}
