package com.example.codingExamples.arrays;

import java.util.Scanner;

public class SingleDirectionArray {
    public static void main(String[] args) {
        //pre-defined array
        /*
        int[] a = new int[]{10,20,30,40,50};
        */

        //user-defined array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("enter the array elements:");
        for(int i =0 ;i < size; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Array elements are :");
        for (int i =0; i < size ; i++){
            System.out.print(a[i]+",");
        }
    }
}
