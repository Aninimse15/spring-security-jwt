package com.example.codingExamples.stringPrograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for reverse:");
        int number = sc.nextInt();
        int revNumber = 0;

        while(number > 0) {
            int k = number % 10;
            revNumber = revNumber * 10 + k;
            number = number / 10;
        }

/*
//        using inbuilt method
        int reversedNumber =Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());
//        or
        int reversed = Integer.parseInt(new StringBuilder("" + number).reverse().toString());
*/
        System.out.println("reversed number:"+revNumber);
    }
}
