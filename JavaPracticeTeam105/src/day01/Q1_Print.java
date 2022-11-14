package day01;

public class Q1_Print {
    /* konsolda:
    "Hello "\/'World'"
    yazdırınız*/
    /*
      \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
              \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
              \\  : Prints a back slash    : \  Ters slash yazdırır
              \'  : Prints single quote    : '  Tek tırnak yazdırır.
              \"  : Prints double quote    : "  Çift tırnak yazdırır.
     */


    public static void main(String[] args) {
        System.out.println("\"Hello \"\\/'World'\"");// ctrl + d : aşağıya tüm satırı kopyalar
        System.out.println("\"Hello \"\\/'World'\"");
        System.out.println('\''); // char olarak tek tırnagı yazdırma yapar
        /*
        ***********************************
                 " ATM'ye Hoşgeldiniz"

           1- Bakiye Sorgulama
           2- Para Yatırma
           3- Para Çekme
           4- Menuden Çıkış
         ***********************************
         */
        // \n ile bir alt satıra iner
        System.out.println("**********************************" +
                "\n\t\t\" ATM'ye Hoşgeldiniz\""+
                "\n\n\t1- Bakiye Sorgulama\n\t" +
                "2- Para Yatırma\n\t" +
                "3- Para Çekme\n\t" +
                "4- Menuden Çıkış\n" +
                "**********************************");





        System.out.println("ali"+ "ayse"); // concatiination bağlama
    }
}
