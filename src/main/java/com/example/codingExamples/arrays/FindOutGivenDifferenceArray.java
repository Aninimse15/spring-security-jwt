package com.example.codingExamples.arrays;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class FindOutGivenDifferenceArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Array elements:");
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the difference to find out array:");
        int diff = sc.nextInt();

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i:arr){
            set.add(i);
        }

        for(int i:arr){
            if(set.contains(i + diff)){
                System.out.println("{"+i+ ","+ (i+diff) + "}");
            }
        }
    }
}
