package day06;

import java.util.Arrays;

public class Q3_Arrays {
    // create an array of 5 floats and calculate their sum
    public static void main(String[] args) {
        float [] sayilar={1.0f,2.0f,3.0f,4.0f,5.0f};
     /* şeklinde de olabilir;
     float [] sayilar=new float[5];
        sayilar= new float[]{1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
      */
        System.out.println("===============  FOR çözümü  =============");
        float toplam=0;

   for(int i=0; i< sayilar.length; i++) {
        toplam+=sayilar[i];
     }
        System.out.println(toplam);
        System.out.println("===============  while çözümü  =============");
        toplam=0;
        int index=sayilar.length-1;

        while (index>=0){
            toplam+=sayilar[index];
            index--;
        }
        System.out.println(toplam);

        // veya soyle..........

        System.out.println("===============  while çözümü 2 =============");
        toplam=0;
        index=0;

        while (index< sayilar.length){
            toplam+=sayilar[index];
            index++;
        }
        System.out.println(toplam);
        System.out.println("=============== Do while çözümü  =============");
        toplam=0;
        index=0;
        do {
            toplam+=sayilar[index];
            index++;

        }while (index< sayilar.length);
        System.out.println(toplam);



  }
}
