package Practice_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArrayList {
    public static void main(String[] args) {
         /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi,
            kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi
            olusturup ekleyelim, ve gosterelim.
     */

        List<String> databaseIsimler=new ArrayList<>();
        databaseIsimler.add("Enes");
        databaseIsimler.add("Ismail");
        databaseIsimler.add("Abdulbaki");
        databaseIsimler.add("Emre");
        databaseIsimler.add("Melisa");
        databaseIsimler.add("Oguz");
        System.out.println("databaseIsimler = " + databaseIsimler);

        Scanner scan=new Scanner(System.in);
        System.out.println("Kullanmak istediginiz username i giriniz: ");
        String username= scan.nextLine().trim();

        boolean usernameVarMi=databaseIsimler.contains(username);

        if (usernameVarMi){
            System.out.println("Bu kullanici adi zaten alinmis");
        }else System.out.println("Bu kullanici adini kullanabiliirsiniz");

        if (usernameVarMi){
            int randomSayi= new Random().nextInt(100);
            username+=randomSayi;
            System.out.println("Yeni kullanici adiniz :"+ username);
            databaseIsimler.add(username);
            System.out.println("databaseIsimler = " + databaseIsimler);
        }else System.out.println("Yeni kullanici adiniz :"+username);
        databaseIsimler.add(username);
        System.out.println("databaseIsimler = " + databaseIsimler);
    }
}
