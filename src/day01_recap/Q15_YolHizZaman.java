package day01_recap;

import java.util.Scanner;

public class Q15_YolHizZaman {
    public static void main(String[] args) {
          /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gideceginiz mesafeyi km olarak yaziniz");
        double mesafe=scan.nextDouble();

        System.out.println("Ortalama hiziniz?(km/sa)");
        double hiz=scan.nextDouble();

        double varis_suresi=mesafe/hiz;
        System.out.println("varis sureniz:"+varis_suresi);




    }
}
