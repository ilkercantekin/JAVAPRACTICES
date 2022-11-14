package day5;

import java.util.Scanner;

public class Q2_EnBuyukSayi {
    public static void main(String[] args) {
        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen aralarda enter a basarak beş pozitif sayı giriniz");
        int enBuyukSayi = 0;
        int sayac = 0;

        while (sayac < 5) {
            int sayi = scan.nextInt();
            if (sayi > enBuyukSayi) {
                enBuyukSayi = sayi;
            }
            sayac++;
        }
        System.out.println("girilen en buuyuk sayı:" + enBuyukSayi);
    }
}