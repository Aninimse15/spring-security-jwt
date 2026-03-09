package com.example.codingExamples;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to calculate string compression:");
        String str = sc.nextLine();

       StringBuilder stringBuilder = new StringBuilder();
       int count = 1;
       for(int i = 1 ; i <str.length(); i++){
           if(str.charAt(i) == str.charAt(i-1)){
               count++;
           }
           else{
               stringBuilder.append(str.charAt(i-1)).append(count);
               count = 1;
           }
       }

       stringBuilder.append(str.charAt(str.length()-1)).append(count);
        System.out.println("Compressed String: " + stringBuilder);
    }
}
