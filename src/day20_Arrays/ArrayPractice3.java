package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("how many numbers do you want to enter?");
        int num= scan.nextInt();
        while(num<=0){
            System.out.println("invalid number, enter again");
            num= scan.nextInt();
        }

        int []b= new int[num];// here in this initialization, num shows how many number we will get from user at for loop,
        //array needs to have enough capacity to contain all the elements user going to enter
        for (int i = 0; i < num; i++) {
            System.out.println("enter your number");
            b[i]=scan.nextInt();//it will repeat this loop given times b[0],b[1],b[3]... and assign it to each input
        }
        System.out.println(Arrays.toString(b));//array is a utility here, and we use toString method to call my string
    }
}
