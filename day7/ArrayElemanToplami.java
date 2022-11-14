package day7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElemanToplami {
    public static void main(String[] args) {
        // Kullanicidan istedigi kadar sayi alip,
        // bu sayilari bir Array'de toplayip
        // bu sayilarin toplamini yazdiran bir program yaziniz
        Scanner scan=new Scanner(System.in);
        double [] sayilar;
        double sum=0;
        int size;

        System.out.println("Kaç adet sayı girmeyi istiyorsunuz");
        size= scan.nextInt();
        sayilar=new double[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("lütfen sayı giriniz");
            sayilar[i]= scan.nextDouble();
            sum+=sayilar[i];
        }
        System.out.println("sayıların Arrayi ="+ Arrays.toString(sayilar) +
                "sayıların toplamı :" + sayilar);


    }





}
