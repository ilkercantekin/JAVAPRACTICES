package day3;

import java.util.Scanner;

public class HesaoMakinesi {
    public static void main(String[] args) {

        /*
        kullanıcıdan alacagınız iki sayıyı yine kullanıcıın
        seçeceği  dörrt işlemden birini yaprıtıp yazdırın
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("iki sayıyı giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        System.out.println("Lütefn yapmak istediğiniz işlemi seçiniz" +
                "\n\t toplama için 1 \n\t Çıkarma için 2 \n\t Çarpma için 3 \n\t Bölme için 4" );
        int islem=scan.nextInt();

        if (islem==1) System.out.println("girilen sayıların toplamı= " + (sayi1+sayi2));
        else if (islem==2) System.out.println("girilen sayıların farkı= " + (sayi1-sayi2));
        else if (islem==3) System.out.println("girilen sayıların çarpımıı= " + (sayi1*sayi2));
        else if (islem==4) System.out.println("girilen sayıların bölümü= " + (sayi1/sayi2));
        else System.out.println("Hatalı giriş yapıldı");


    }
}
