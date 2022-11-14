package day02;

import java.util.Scanner;

public class Q3_Scanner_ifStatement {
    public static void main(String[] args) {
        /*
    Bir dersten alinan vize, final ve devam puanlarinin girilip
    ortalama hesaplandiktan sonra
    dersten gecilip
    gecilmedigini consola yazdiran bir program yazalim.
     */
        // ortalama = vizenin %10'i + finalin %80'si + devam puaninin %10'u
// geçme notu 70 , 60-70 arası şartlı  geçiş , 60 altı kalsın sınıfta

        Scanner scan=new Scanner(System.in);



        System.out.println("lütfen vize notunuzu  giriniz") ;
       double vize= scan.nextDouble();
               System.out.println(" final notunuzu  giriniz");
        double  finalnotu=scan.nextDouble();
        System.out.println("devam notunuzu  giriniz");
        double devam= scan.nextDouble();

        /*  System.out.println("lütfen vize :\n "+
         "final: notunuzu giriniz \n"+
          "devam  notunuzu  giriniz") ;
          şeklindede yazılabilirç

         */
        double  ortalama= ( vize *0.1 ) + (finalnotu *0.8) + (devam *0.1);
        if ( ortalama>=70) {
            System.out.println("geçtiniz");   // aynı satırda süslü paranteze gerek yok
        } else if
            (ortalama >= 60) {System.out.println("şartlı geçiş");
        } else      {       System.out.println("kaldınız");
        }



    }
}
