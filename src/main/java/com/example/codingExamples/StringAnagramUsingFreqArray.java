package com.example.codingExamples;

import java.util.Scanner;

public class StringAnagramUsingFreqArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string :");
        String str1 = sc.nextLine();

        System.out.println("Enter Second String :");
        String str2 = sc.nextLine();

        if(checkAnagramUsingFrequencyArray(str1.toLowerCase(),str2.toLowerCase())) System.out.println("Strings are anagram");
        else System.out.println("Strings are not anagram");
    }

    public static boolean checkAnagramUsingFrequencyArray(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        int[] freq = new int[26];
        for(char ch :str1.toCharArray()){
            freq[ch - 'a']++;
        }
        for(char ch :str2.toCharArray()){
            freq[ch - 'a']--;
        }

        for(int num: freq){
            if(freq[num] != 0){
                return  false;
            }
        }

        return true;
    }
}
