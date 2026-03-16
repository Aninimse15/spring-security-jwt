package com.example.codingExamples.arrays;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //pre-defined array
        /*
        int[][] arr = new int[][] {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        */

        //user-defined array
        System.out.println("Enter the sizes of array ");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();

        int[][] arr = new int[size1][size2];

        System.out.println("Enter array elements:");
        for(int i = 0 ; i< size1 ; i++){
            for(int j =0; j<size2 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter array are:");
        for(int i = 0 ; i< size1 ; i++){
            for(int j =0; j<size2 ; j++){
                System.out.print(arr[i][j]+",");
            }
        }
    }
}
