package Practice_04;

import java.util.Scanner;

public class Q04_DoWhileLoop {
    public static void main(String[] args) {
        /*
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.
		     */
        Scanner scan=new Scanner(System.in);
        String kelime="";

        do {
            System.out.println("Lutfen bir kelime giriniz: ");
            kelime=scan.nextLine();
            if (kelime.length()<3){
                System.out.println("girilen kelime 3 karakterden az");
            }
            if (kelime.length()%2==1 && kelime.length()>=3){
                System.out.println("ortadaki karakter: "+ kelime.charAt(kelime.length()/2));
            }else System.out.println("You entered wrong word.");
        }while(!(kelime.length()%2==1 && kelime.length()>=3));

    }
}
