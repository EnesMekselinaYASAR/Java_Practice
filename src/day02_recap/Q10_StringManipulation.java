package day02_recap;

import java.util.Scanner;

public class Q10_StringManipulation {
    public static void main(String[] args) {

        /*
        Kullanicidan ismini ve soyisimi girmesini isteyin,
        sonrasinda konsola tam ismini buyuk harfler ile yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz");
        String isim=scan.nextLine(), soyIsim=scan.nextLine(); // multiple declaration

        String fullName=isim.concat(" "+ soyIsim).toUpperCase();
        System.out.println("fullName = " + fullName);




    }
}
