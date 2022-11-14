package basic_practice;

import java.util.Scanner;

public class Q5_KelimeninOrtasiniYazdirma {
    public static void main(String[] args) {
        /*
 Tek sayida harf iceren bir String degiskenin ortasindaki harfi
 konsolda yazdirmak icin bir Java programi yaziniz.
 Eger kelime cift sayida harf iceriyorsa ortadaki 2 harfi yazdiran method oluşturun
 ORNEK:
       INPUT  :  Python
       OUTPUT :  th
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("kelimeyi giriniz");
        String kelime= scan.next();
        System.out.println(ortadakiHarfiYazdir(kelime));
    }

    public static String  ortadakiHarfiYazdir(String kelime) {
     int uzunluk=kelime.length();
     int ortadakiIndex=uzunluk/2;
     int baslangicindexi=ortadakiIndex-1;
     int bitişindexi=ortadakiIndex+1;

     if (uzunluk%2==0) return kelime.substring(baslangicindexi,bitişindexi);
     // if (uzunluk%2==0) return kelime.substring(kelime.length/2)-1,kelime.length/2);
     else                   return kelime.substring(ortadakiIndex,ortadakiIndex+1);
     //else return kelime.substring(kelime.length/2,(kelime.length/2)+1);

     }



    }

