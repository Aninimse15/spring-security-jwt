package com.example.codingExamples.numberPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check Armstrong :");
        int num = sc.nextInt();

        if (num < 0){
            System.out.println("Negative number are not valid");
            return;
        }

        System.out.println("Enter a choice by which method want to find solution \n1.Inbuilt \n2.Manual");
        int choice = sc.nextInt();

        int armstrongSum = 0 ;

        switch (choice) {
            case 1:
                armstrongSum =  checkArmstrongNumberUsingInbuiltMethod(num);
                break;
            case 2:
                armstrongSum  = checkArmstrongNumberUsingManualMethod(num);
                break;
            default:
                System.out.println("Please enter right choice");
                return;
        }

        if(armstrongSum == num) System.out.println("Number is an Armstrong Number");
        else System.out.println("Number is not an Armstrong Number");
    }

    public static int checkArmstrongNumberUsingInbuiltMethod(int num){
        int digitCount = String.valueOf(num).length();
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digitCount);
            temp /= 10;
        }

        return sum;
    }
    public static int checkArmstrongNumberUsingManualMethod(int num){
        int digitCount = 0;
        int numberCopy = num;
        while(numberCopy > 0 ){
            numberCopy/= 10;
            digitCount++;
        }
        numberCopy = num ;
        int armstrongSum = 0;
        while(numberCopy > 0){
            int digit = numberCopy % 10;
            int powerResult = 1;
            for(int  i = 0 ; i < digitCount ; i++ ) {
                powerResult *= digit ;
            }
            armstrongSum = armstrongSum + powerResult;
            numberCopy = numberCopy / 10;
        }
        return armstrongSum;
    }
}
