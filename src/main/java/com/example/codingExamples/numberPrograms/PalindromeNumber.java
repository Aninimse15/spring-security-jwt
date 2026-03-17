package com.example.codingExamples.numberPrograms;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check palindrome :");
        int num = sc.nextInt();

        System.out.println("Enter a choice by which method want to find solution \n1.Inbuilt \n2.Manual");
        int choice = sc.nextInt();

        int result = 0;

        switch (choice) {
            case 1:
                result = checkPalindromeNumberUsingInbuiltMethod(num);
                break;
            case 2:
                result = checkPalindromeNumberUsingManualMethod(num);
                break;
            default:
                System.out.println("Please enter right choice");
                return;
        }

        if(result == num ) System.out.println("Numbers are palindrome");
        else System.out.println("Numbers are not palindrome");
    }

    public static int checkPalindromeNumberUsingInbuiltMethod(int num){
        return Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
    }

    public static int checkPalindromeNumberUsingManualMethod(int num){
        int temp = num;
        int revNum = 0;
        while(temp > 0){
            int digit = temp % 10;
            revNum = revNum * 10 + digit;
            temp = temp / 10;
        }
        return revNum;
    }
}
