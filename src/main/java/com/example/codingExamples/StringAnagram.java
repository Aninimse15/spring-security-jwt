package com.example.codingExamples;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string :");
        String str1 = sc.nextLine();

        System.out.println("Enter Second String :");
        String str2 = sc.nextLine();

        if(str1.length() != str2.length()) System.out.println("Strings are not anagram");

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        System.out.println("Enter a choice by which method want to find solution \n1.Inbuilt \n2.Manual");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                getAnagramUsingInBuiltMethod(arr1 , arr2);
                break;
            case 2:
                getAnagramUsingManualMethod(arr1 , arr2);
                break;
            default:
                System.out.println("Please enter right choice");
                break;
        }

    }

    public static void getAnagramUsingManualMethod(char[] charArray1 , char[] charArray2){
        char[] sortedArray1 =  getSortedArray(charArray1);
        char[] sortedArray2 = getSortedArray(charArray2);
        boolean isAnagram = true;
        for(int i = 0 ;i < charArray1.length ; i++){
            if(! (sortedArray1[i] == sortedArray2[i])) {
                isAnagram = false;
                break;
            }
        }
        if(isAnagram) System.out.println("Strings are anagram");
        else System.out.println("Strings are not anagram");

    }

    public static void getAnagramUsingInBuiltMethod(char[] charArray1 , char[] charArray2){

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if(Arrays.equals(charArray1 ,charArray2)) System.out.println("Strings are anagram");
        else System.out.println("Strings are not anagram");
    }

    public static char[] getSortedArray(char[] charArray) {

        int[] freq = new int[26];

        // Count characters
        for(char ch : charArray){
            freq[ch - 'a']++;
        }

        char[] resultArray = new char[charArray.length];
        int a = 0;

        // Build sorted list
        for(int i = 0; i < 26; i++){
            while(freq[i] > 0){
                char ch = (char) (i + 'a');
                resultArray[a] = ch;
                a++;
                freq[i]--;
            }
        }

        return resultArray;
    }
}
