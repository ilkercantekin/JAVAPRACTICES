package day04;

import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args) {
        /*
        Kullanicidan uc adet sayi alarak bu sayilarin
        bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
        NOT:
        Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
        denkleminden yararlanabilirsiniz.
        -----Ornek Ekran Ciktisi-----
        ilk kenari giriniz: 2
        ikinci kenari giriniz 15
        üçüncü kenari giriniz: 7
        Bu bir dik ucgen degildir.
        Bu bir dik ucgendir.
     */
        int[] kenarlar = new int[3];
        int kenarsayac = 1;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + " .kenar uzunlugunu girin :");
            kenarlar[i] = scan.nextInt();
        }
        if (Math.pow(kenarlar[0], 2) + Math.pow(kenarlar[1], 2) == Math.pow(kenarlar[2], 2) ||
             Math.pow(kenarlar[1], 2) + Math.pow(kenarlar[2], 2) == Math.pow(kenarlar[0], 2) ||
             Math.pow(kenarlar[2], 2) + Math.pow(kenarlar[0], 2) == Math.pow(kenarlar[1], 2)) {
            System.out.println("bu dik üçgendir");

        } else System.out.println("bu dik üçgen değildir");
    }


}
