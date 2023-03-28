package Practice_02;

public class Q01_MethodCreation {
    public static void main(String[] args) {
        /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
        */

        birkereYazdir("nazli hilal yasar");
        }

    public static void birkereYazdir(String str) {
        String sonuc="";
        /*
         String default degeri "" oldugu icin isleme etki etmemesin
         diye bu sekilde atama yapıldı
         */
        for (int i = 0; i <str.length() ; i++) { //int i = 0; i <= str.length()-1; i++ bu sekilde de olur
            if (!sonuc.contains(str.substring(i,i+1))){ //tekrarsiz karakterleri dondurecegimiz icin sonucumuz str den aldigimiz herhangi bir karakteri icermesin
                sonuc+=str.substring(i,i+1); //o zaman sonuca eklesin
            }
        }
        System.out.println(sonuc);

    }
}
