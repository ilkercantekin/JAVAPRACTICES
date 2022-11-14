package basic_practice;

import java.util.Scanner;
/*
        * Ask user Name, Surname and credit card numbers than convert it to special
        * form
        *
        * (Check credit card number, if there aren't 16 digit print
        * "Invalid credit card number"
        *
        * Input : John White 1234234534561478
        * Output : Name : J*** W****
        *          CCN  : **** **** **** 1478
        *  (Initials for name and surname should be uppercase)

        */
public class Q2_HidingNameAndNumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("isminizi giriniz");
        String  isim=scan.nextLine();
        System.out.println("Soyisminizi giriniz");
        String  soyIsim=scan.nextLine();
        System.out.println("kart nonuzu giriniz:");
        String ccn=scan.nextLine();
        if (ccn.length()!=16) {
            System.out.println("Invalid credit card number");
        } else {
            isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
            soyIsim = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).replaceAll("\\w", "*");

            //  ccn="**** **** ****"+ ccn.substring(12);}
            ccn = ccn.substring(0, 12).replaceAll("\\w", "*") + ccn.substring(12);
            System.out.println("Name:" + isim + "    Soy isim: " + soyIsim + "\nCCN: " + ccn);
        }}
}
