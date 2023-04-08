package Practice_08.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */
    public static void main(String[] args) {
        System.out.println("Hosgeldiniz okulumuza");
        Scanner scan=new Scanner(System.in);

        System.out.println("isminiz :");
        String isim=scan.nextLine();

        System.out.println("soyisminiz :");
        String soyIsim=scan.nextLine();

        System.out.println("yasiniz :");
        int yas=scan.nextInt();
        scan.nextLine(); // dummy hayalet komut.

        System.out.println("bransiniz :");
        String brans=scan.nextLine();

        System.out.println("tel no :");
        String telNo=scan.nextLine();

        OgretmenBilgileri adayOgretmen=new OgretmenBilgileri(isim,soyIsim,yas,brans,telNo);
        List<OgretmenBilgileri> ogretmenList=new ArrayList<>();
        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);


    }

}
