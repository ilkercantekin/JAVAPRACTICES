package basic_practice;

import java.util.Scanner;

public class Q8_koordinatDuzlemi {

    // Kullanicidan aldiginiz koordinat noktasinin (x=3,y=-1)
    // koordinat duzleminde hangi bölgede oldugunu yazdiran bir kod yaziniz.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("koordinat düzlemindeki noktaının x ve y degerlerini giriniz");
        int x =scan.nextInt();
        int y =scan.nextInt();

        if (x>0 && y>0) System.out.println("Girdiğiniz nokta 1.Bölgededir");
        else if (x<0 && y>0) System.out.println("Girdiğiniz nokta 2.Bölgededir");
        else if (x<0 && y<0) System.out.println("Girdiğiniz nokta 3.Bölgededir");
        else if (x>0 && y<0) System.out.println("Girdiğiniz nokta 4.Bölgededir");
        else if (x!=0) System.out.println("Girdiğiniz nokta x eksenindedir");
        else if (y!=0) System.out.println("Girdiğiniz nokta y eksenindedir");
        else  System.out.println("Girdiğiniz nokta orjindedir");




    }
}
