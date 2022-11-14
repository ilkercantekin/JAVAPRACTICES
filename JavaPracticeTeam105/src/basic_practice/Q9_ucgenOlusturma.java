package basic_practice;

import java.util.Scanner;

public class Q9_ucgenOlusturma {

    /*
    Kullanicidan 3 tane pozitif  tam sayi alniz.
    bu uc sayinin ucgen olusturma durumunu kontrol ediniz
    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol ediniz
    üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
    herhangi iki kenar farkı diger kenardan kücük olmali
     a+b>c>a-b
     a+c>b>a-c
     b+c>a>b-c
    a=b=c ise es kenar ucgen
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ücgenin  3 kenarını giriniz");
        int topAveB = 0, farkAveB = 0;
        int topAveC = 0, farkAveC = 0;
        int topBveC = 0, farkBveC = 0;
        int a, b, c;
        a = scan.nextInt();
        scan.nextLine();
        String yanlisGirisMesaji = "yanlış deger giridniz";
        if (a <= 0) {
            System.out.println(yanlisGirisMesaji);
            System.exit(0);
        }
        b = scan.nextInt();
        scan.nextLine();
        if (b <= 0) {
            System.out.println(yanlisGirisMesaji);
            System.exit(0);
        }
        c = scan.nextInt();
scan.nextLine();
        if (c <= 0) {
            System.out.println(yanlisGirisMesaji);
            System.exit(0);
        }
        topAveB = a + b;
        topAveC = a + c;
        topBveC = b + c;

        farkAveB = Math.abs(a - b);// mutlak deger almak için kullanılır Math.abs()
        farkAveC = Math.abs(a - c);
        farkBveC = Math.abs(b - c);

        if (topAveB > c && c > farkAveB &&
                topAveC > b && b > farkAveC &&
                topBveC > a && a > farkBveC) {
            System.out.println("girilen degerler ile ucgen oluşabilir");
            if (farkAveB == 0 && farkAveC == 0) {
                System.out.println("girilen degerler ile eşkenar ücgendir");
            }


        } else System.out.println("girilen degerler ile ucgen oluşturulamaz");
    }
}
