package basic_practice;

import java.util.Scanner;

public class Q03_GunIsmıYazdirma {
    /*
    /*Kullanicidan gun numarasini alip
    gun ismini yazdiran bir program yazin
         */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen gün nosunu giriniz");
        int gunnosu=scan.nextInt();

        System.out.println("===============IF ELSE COZUMU================");
        if (gunnosu<=0 || gunnosu>7) System.out.println("yanlış günnosu girdiniz");
        else if (gunnosu==1) System.out.println("pazartesi");
        else if (gunnosu==2) System.out.println("sali");
        else if (gunnosu==3) System.out.println("carsamba");
        else if (gunnosu==4) System.out.println("perşembe");
        else if (gunnosu==5) System.out.println("cuma");
        else if (gunnosu==6) System.out.println("cumatesi");
        else System.out.println("pazar");


        System.out.println("===================  SWITCH CASE ===============");

        switch (gunnosu){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
            default:
                System.out.println("yanlış günnosu girdiniz");
        }

        /*
          Kullanicidan gun ismini alin
          ve girilen gun ismine gore
          hafta ici veya hafta sonu yazdirin
         */
        System.out.println("gün ismini giriniz");
        String gunIsmi= scan.next();// nextline yazarsan hemen attlıyor herşeyi

        // PazarTesi,pAZARtesi yazarsa günü lower ile düzenleyelim
        gunIsmi=gunIsmi.toLowerCase();
        switch (gunIsmi){
            case "pazartesi" :
            case "salı" :
            case "carşamba" :
            case "perşembe" :
            case "cuma" : System.out.println("girdiginiz gün hafta icidir");break;
            case "cumartesi" :
            case "pazar" : System.out.println("girdiginiz gün hafta sonudur");break;
            default: System.out.println("yanlış gün ismi girdiniz");
        }

    }
}
