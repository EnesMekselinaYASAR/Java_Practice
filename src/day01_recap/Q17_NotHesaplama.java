package day01_recap;

import java.util.Scanner;

public class Q17_NotHesaplama {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("1.vize notunuzu giriniz:");
        double vize1=scan.nextDouble();
        System.out.println("2.vize notunuzu giriniz:");
        double vize2=scan.nextDouble();
        System.out.println("final notunuzu giriniz:");
        double finalNotu=scan.nextDouble();

        double gecmeNotu=(vize1+vize2)/2*0.3+finalNotu*0.7;

        System.out.println("gecme notunuz:"+gecmeNotu);




    }
}
