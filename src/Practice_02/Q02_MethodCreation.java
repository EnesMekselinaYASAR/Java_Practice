package Practice_02;

import java.util.Scanner;

public class Q02_MethodCreation {
    public static void main(String[] args) {
     // cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
        Scanner scan=new Scanner(System.in);
        System.out.print("metre ve km ye donusturmek istediginiz cm degerini giriniz: ");
        double sayi= scan.nextDouble();

        kmyeDonusturucu(sayi);
    }

    public static void kmyeDonusturucu(double sayi) {

        double metre=sayi/100;
        double km=metre/1000;
        System.out.println("girdiginiz cm degeri: "+sayi+", "+metre+" metredir, "+km+" km dir.");
    }
}
