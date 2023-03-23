package day01_recap;

import java.util.Scanner;

public class Q07_Converting {
    public static void main(String[] args) {

         /*
      Soru 1 -) galonu litreye ceviren bir java programi yaziniz
                1 gallon = 3.785 litre
                litreyi galona ceviren bir java programi yaziniz
                  1 litre = 1/3.785 gallon
      */

        double gallon=45.5;
        double litre=gallon*3.785;
        String sonuc=gallon+" gallon degeri "+litre+" litreye eşittir";

        System.out.println(sonuc);

        double litre1=3785;
        double gallon1=litre1/3.785;

        System.out.println(litre1+" litre degeri "+gallon1+" gallona eşittir");

          /*
        Soru 2 -) Sıcaklığı Fahrenhayt'tan Santigrat derecesine
        çeviren bir Java programı yazın.
         formül
             c = (f-32)*5/9
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("fahrenhayt degerini giriniz");

        double fh=scan.nextDouble();

        System.out.println("girdiginiz fahrenayt degeri "+(fh-32)*5/9+" santigrat derecedir");
    }
}
