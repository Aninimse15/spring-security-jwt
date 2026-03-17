package com.example.codingExamples.stringPrograms;

import java.util.Scanner;

public class CountWordsInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence to calculate words in sentence");
        String sentence = sc.nextLine();

        System.out.println("Enter a choice by which method want to find solution \n1.Inbuilt \n2.Manual");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                countWordsUsingInbuiltSplitMethod(sentence);
                break;
            case 2:
                countWordsUsingManualMethod(sentence);
                break;
            default:
                System.out.println("Please enter right choice");
                break;
        }
    }

    public static void countWordsUsingInbuiltSplitMethod(String sentence){
        sentence = sentence.trim();

        if(sentence.trim().isEmpty()){
            System.out.println("Number of words in sentence : 0");
            return;
        }

        String[] words = sentence.split("\\s+");

        System.out.println("Number of words in sentence : " + words.length);
    }

    public static void countWordsUsingManualMethod(String sentence){
        int count = 0;

        for(int i = 0; i < sentence.length(); i++){

            if(sentence.charAt(i) != ' ' && (i == 0 || sentence.charAt(i-1) == ' ')){
                count++;
            }
        }

        System.out.println("Number of words in sentence: " + count);
    }
}
