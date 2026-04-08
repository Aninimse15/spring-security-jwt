package com.example.codingExamples.arrays;

import java.util.Scanner;

public class SearchKeyUsingBinarySearchAlgorithm {
    public static void main(String x[])
    {
        Scanner xyz  = new Scanner(System.in);
        int[] a =new int[]{10,20,30,40,50,60,70,80,90,100};
        System.out.println("Enter search key value");
        int skey = xyz.nextInt();
        int left = 0 ;
        int right = a .length-1 ;
        int index=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(a[mid]==skey)
            {
                index=mid;
                break;
            }
            if(a[mid]<skey)
            {  left=mid+1;
            }
            else
            {  right=mid-1;
            }
        }
        if(index!=-1)
        { System.out.println("Data found");
        }
        else{
            System.out.println("Data not found");
        }
    }
}
