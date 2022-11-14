package day5;

import java.util.Scanner;

public class Q3_ReverseNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayiyi giriniz:");
        int  input=scan.nextInt();
        System.out.println("girilen sayıının ters hali:     " + reverseNumber(input));

    }
    public static int reverseNumber(int input){
        int reverseNum=0;
        while (input>0){
            reverseNum=input%10 + reverseNum*10;
            input=input/10;
        }
        return reverseNum;


    }
}


