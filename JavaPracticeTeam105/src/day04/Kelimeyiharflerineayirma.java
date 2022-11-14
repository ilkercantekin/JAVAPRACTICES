package day04;

import java.util.Arrays;

public class Kelimeyiharflerineayirma {
    public static void main(String[] args) {
        /*
         * create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         *
         Parametre olarak String bir isim girdiginiz, size o ismin harflerini
         bir char Array olarak yazdiran bir method olusturunuz.
         toCharArray() methodunu kullanmayiniz!
         * Input : John
         * Output : [J, o, h, n]
         */
 String  name="semra";
 kelimeninHarfleriarrayi(name);
 kelimeninHarfleriarrayi("String");
    }
    public static void kelimeninHarfleriarrayi(String input){
        char[] output= new char[input.length()];
        for (int i = 0; i <input.length() ; i++) {
            output [i]= input.charAt(i);
        }
        System.out.println("Girilen kelimenin harfleri arrayi: " + Arrays.toString(output));
    }

    // İKİNC ÇÖZÜM YOLU
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir cümle yazınız : ");
        String text = scanner.next();

        show_me(text);
    }

    private static void show_me(String text) {

        String output = "";
        int position = 0;
        int text_length = text.length();

        while(position < text_length)
        {
            output += text.substring(position,position+1) + ", ";
            position++;
        }

        System.out.println("[" + output.substring(0,output.length()-2)  +"]");
    }*/
}
