package Practice_04;

import java.util.Scanner;

public class Q10_Interview {
    public static void main(String[] args) {
        /*
         * Kullanicidan alinan bir Stringin ilk ve son harfini
         * yine kullanicidan alinan sayi kadar return eden metod yaziniz
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz: ");
        String input= scan.nextLine();
        System.out.println("lutfen bir sayi giriniz: ");
        int sayi= scan.nextInt();

        System.out.println(ilkSonHarf(input,sayi));
    }

    private static String ilkSonHarf(String str, int n) {
        String s=str.substring(0,1)+str.substring(str.length()-1);
        String sonuc="";

        for (int i = 1; i <=n ; i++) {
            sonuc+=s;
        }
        return sonuc;

            /*
        input yerine str sayi yerine n kullanabiliriz, değismez.
         bu method ilkSonHarf e tanımlı, sadece isimleri farklı
         */

    }
}
