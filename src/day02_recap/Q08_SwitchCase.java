package day02_recap;

import java.util.Scanner;

public class Q08_SwitchCase {
    public static void main(String[] args) {
        //Girilen uc haneli bir sayinin okunusunu yazı ile yazdırınız

        Scanner scan=new Scanner(System.in);
        System.out.print("uc haneli bir sayi girin:");
        int sayi=scan.nextInt(),birlerBas=sayi%10,onlarBas=(sayi/10)%10,yuzlerBas=sayi/100;

        if(sayi>99&&sayi<1000){
            switch (yuzlerBas){
                case 0: System.out.print(""); break;
                case 1: System.out.print("yuz\t"); break;
                case 2: System.out.print("iki yuz\t"); break;
                case 3: System.out.print("uc yuz\t"); break;
                case 4: System.out.print("dort yuz\t"); break;
                case 5: System.out.print("bes yuz\t"); break;
                case 6: System.out.print("alti yuz\t"); break;
                case 7: System.out.print("yedi yuz\t"); break;
                case 8: System.out.print("sekiz yuz\t"); break;
                case 9: System.out.print("dokuz yuz\t"); break;
            }switch (onlarBas){
                case 0: System.out.print(""); break;
                case 1: System.out.print("on\t"); break;
                case 2: System.out.print("yirmi\t"); break;
                case 3: System.out.print("otuz\t"); break;
                case 4: System.out.print("kirk\t"); break;
                case 5: System.out.print("elli\t"); break;
                case 6: System.out.print("altmis\t"); break;
                case 7: System.out.print("yetmis\t"); break;
                case 8: System.out.print("seksen\t"); break;
                case 9: System.out.print("doksan\t"); break;
            } switch (birlerBas){
                case 0: System.out.print(""); break;
                case 1: System.out.print("bir"); break;
                case 2: System.out.print("iki"); break;
                case 3: System.out.print("uc"); break;
                case 4: System.out.print("dort"); break;
                case 5: System.out.print("bes"); break;
                case 6: System.out.print("alti"); break;
                case 7: System.out.print("yedi"); break;
                case 8: System.out.print("sekiz"); break;
                case 9: System.out.print("dokuz"); break;
            }
        }else System.out.println("Lutfen uc basamakli bir sayi giriniz");





    }
}
