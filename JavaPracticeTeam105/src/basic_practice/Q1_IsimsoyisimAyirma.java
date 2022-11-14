package basic_practice;

import java.util.Scanner;

public class Q1_IsimsoyisimAyirma {
    /*// Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
// ad ayrı soyad ayrı sekilde ekrana yazdırınız.
 input  : "AHMET YILMAZ"
    output : Ahmet
                  Yilmaz           */


    public static void main(String[] args) {
// substring metodu üzerinde işlem yapılan  Stringin istenen bir parçasını size geri döndürür.
        // bunu yaparken iki farklı olanak sunar
        // ilki: bir  int parametree ister ve belirilen index ten stringin sonuna kadar size geri döndürür.
        // ikinicisi: 2 taneint parameter ister , ilk int parametrer başlangıç indexine işaret eder
        // ve 0 indexi de dahil ederek verilen ikinci indee kadar olan Stringe size döndürür.
        // İkinci indexteki  kinci index'teki karakter
        //// dahil degildir.

        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen isim soyisim giriniz:");
        String adSoyad=scan.nextLine();

        String ad=adSoyad.substring(0, adSoyad.indexOf(' '));
        String  soyad= adSoyad.substring(adSoyad.indexOf(' ')+1);
        System.out.println("ad:" + ad+"\nsoyad:" + soyad);



    }

}
