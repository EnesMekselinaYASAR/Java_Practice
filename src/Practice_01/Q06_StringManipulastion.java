package Practice_01;

import java.util.Scanner;

public class Q06_StringManipulastion {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();

        int bosluk=str.indexOf(' ');

        if (bosluk==-1&& !(str.isEmpty())){
            System.out.println("bosluk yoktur");
        }else System.out.println("bosluk vardir");

        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen String bir ifade giriniz : ");
        String ifade = scan.nextLine();

        if (ifade.contains(" ")) {
            System.out.println("Vermiş oldugunuz ifade bosluk karakteri icermektedir.");
        } else {
            System.out.println("Vermis oldugunuz ifade bosluk karakteri icermemektedir.");
        }
         */




    }
}
