package com.example.codingExamples.arrays;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //pre-defined array
        /*
        int[][] arr = new int[][] {
                {10,20},
                {40,50,60,70},
                {70,80,90}
        };
        */

        //user-defined array
        System.out.println("Enter the row size of array ");
        int size1 = sc.nextInt();

        System.out.println("Enter the columns size of array");
        int[][] arr = new int[size1][];
        for (int i = 0 ; i<size1 ; i++){
            int size =  sc.nextInt();
            arr[i] = new int[size];
        }

        System.out.println("Enter array elements:");
        for(int i = 0; i<size1 ; i++){
            for(int j =0; j< arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter array are:");
        for(int i = 0 ; i< arr.length ; i++){
            for(int j =0; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+",");
            }
            System.out.println();
        }
    }
}
