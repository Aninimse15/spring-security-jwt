package com.example.codingExamples;

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
        System.out.println("reversed number:"+revNumber);
    }
}
