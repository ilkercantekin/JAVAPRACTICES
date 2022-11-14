package day02;

import java.util.Scanner;

public class Q1_Scanner_IfStatement {
    public static void main(String[] args) {
      /*
      /*
         * Write a Java program that asks to user 2 questions
          Question1 = how many tea do you drink in a day?
           Question 2 = how many sugar do you use for a glass of tea?

         * Calculate how many sugar does user use as kilogram in a year and in 40 years
         * then print it on the console
         * If user doesn’t use sugar print “Good Job, less sugar more health”
         *
         * (Hint 1 sugar = 2.7 gr)
    */
    /*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda  consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)
    */

       /*
        System.out.println("lütfen günlük kaç bardak çay içtiğiniz yazınız");
        int cay= new Scanner(System.in).nextInt();
        System.out.println("bir bardak çayda kaç şeker kullanıyorsunuz");
        double seker=new Scanner(System.in).nextDouble();
        double total=(cay*(1.7*seker))*365/1000 ;
        System.out.println("yıllık "+ total + " kg şeker tüketiyosunuz");

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("çayınıza şeker atarmısınız");

        char cevap = scan.next().charAt(0);
        if (cevap == 'e' || cevap == 'E') {
            System.out.println("lütfen kaç adet küp şekerkullandıgınızı yazınız");
            double seker = scan.nextDouble();
            System.out.println("günde kaç bardak çay içiyorsunuz");
            int bardak = scan.nextInt();
            ;
            double yillikseker = 365 * bardak * seker * 2.77;
            double kirkyillikseker = yillikseker * 40;
            System.out.println("bir yılda yediğiniz şeker amanın acayip:  "+yillikseker/1000 + "kg\n"+
                    "hele 40 yıllık abooo şeker hastası olcanız :  "+kirkyillikseker/1000 + "kg");
        } else {
            System.out.println("Aferin böyle devam ette yice zayıfla bi deri bi kemik kal");


        }
    }}
