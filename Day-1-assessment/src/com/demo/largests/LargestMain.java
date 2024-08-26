package com.demo.largests;

import java.util.Scanner;

public class LargestMain {


    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
       System.out.println("Enter number1:");
       int a=in.nextInt();
       System.out.println("Enter number2:");
       int b=in.nextInt();
       System.out.println("Enter number3:");
       int c=in.nextInt();
       
     LargestNumber l=new LargestNumber(a, b, c);
     
     System.out.println("The largest number:"+l.getLargest());
    }
}
