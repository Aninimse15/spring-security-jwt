package com.example.codingExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterSortingByFreqArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string want to sort it using frequency array:");
        String str = sc.nextLine();

        List<Character> sortedArrayList = getSortedArray(str);

        sortedArrayList.forEach(System.out::print);
    }

    public static List<Character> getSortedArray(String str) {

        int[] freq = new int[26];

        // Count characters
        for(char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }

        List<Character> sortedArray = new ArrayList<>();

        // Build sorted list
        for(int i = 0; i < 26; i++){
            while(freq[i] > 0){
                char ch = (char) (i + 'a');
                sortedArray.add(ch);
                freq[i]--;
            }
        }

        return sortedArray;
    }
}
