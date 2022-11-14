package day5;

import java.util.Scanner;

public class Q5_topZiplatma {
    //Bir top belirli yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen topun bırakılma yüksekliğini giriniz ");
        double yukseklik = scan.nextDouble() ;
        topuZiplat(yukseklik);
    }

    public static void topuZiplat(double yukseklik) {

        double topunToplamYolu = 0;
        int yereVurmaSayisi = 0 ;

        do{
            yereVurmaSayisi++;
            topunToplamYolu += yukseklik;
            yukseklik*=0.75;
            topunToplamYolu += yukseklik;
        }while(yukseklik>=100);

        System.out.println("Topun yere vurma sayisi = " + yereVurmaSayisi +
                "\nTopun katettigi toplam yol = " + topunToplamYolu);

    }

}
