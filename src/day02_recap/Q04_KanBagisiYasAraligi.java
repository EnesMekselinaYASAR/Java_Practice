package day02_recap;

import java.util.Scanner;

public class Q04_KanBagisiYasAraligi {
    public static void main(String[] args) {
         /*
         Problem tanimi :
        Kullanicidan  yasini ve kilosunu alaliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk, 50 ve 50 kilodan agir ise kan bagisi yapabilir.
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("yasiniz:");
        int yas = scan.nextInt();
        System.out.print("kilonuz:");
        int kilo = scan.nextInt();

        if (yas > 0 && yas < 18) {
            System.out.println("yasi 18 den kucukler kan bagisi yapamaz");
        } else if (yas >= 18) {
            if (kilo > 0 && kilo < 50) {
                System.out.println("kilonuz 50 den az oldugu icin kan bagisi yapamazsiniz");
            } else if (kilo >= 50) {
                System.out.println("kan bagisi yapabilirsiniz");
            }


        }

    }
}