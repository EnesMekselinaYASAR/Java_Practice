package Practice_02;

public class Q05_ForLoop {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

       // System.out.println("for ile");
       // for (int i = 0; i <=255 ; i++) {
       //     char c= (char) i; // casting yaptik, sayi harf ve karakter
       //     System.out.println(i+ " -> "+c);
       // }

       // System.out.println("while ile");
       // int i=0;
       // while (i<=255){
       //     char sembol= (char) i;
       //     System.out.println(i+ " -> "+sembol);
       //     i++;
       // }

        System.out.println("Do while ile");
        int i=0;
        do {
            char sembol= (char) i;
            System.out.println(i+ " -> "+sembol);
            i++;
        }while (i<=255);
    }
}
