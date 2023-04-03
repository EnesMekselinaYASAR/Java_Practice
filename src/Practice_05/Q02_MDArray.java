package Practice_05;

import java.util.Arrays;

public class Q02_MDArray {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        String[][] arr={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double toplam=0;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if (arr[i][j].contains("$")){
                    toplam+=Double.parseDouble(arr[i][j].replace("$",""))*3.2;
                    /*
                     parantez icindeki replaceAll methodu ile $ isaretinden kurtulduk,
                     sonra elimizde "12" var (data type : String)
                     Double toplam variable ile isleme katmak icin data casting yapmak gerekir,
                     bu yüzden Double.parseDouble() methodunu kullandık.
                     bu asamada 12 degeri --> data type : Double oldu, eklerken de 3.2 carpmamizi
                     istedigi icin carptik.
                     */

                }else {
                    toplam+=Double.parseDouble(arr[i][j].replaceAll("€",""))*4.2;
                }
            }
        }
        System.out.println("toplam : "+toplam);























    }
}
