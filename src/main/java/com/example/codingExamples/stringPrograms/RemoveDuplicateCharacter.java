package com.example.codingExamples.stringPrograms;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to remove duplicate character:");
        String str = sc.nextLine();

        System.out.println("Enter a choice by which method want to find solution \n1.Inbuilt \n2.Manual");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                removeDuplicateCharacterUsingInbuiltMethods(str);
                break;
            case 2:
                removeDuplicateCharacterUsingManualMethods(str);
                break;
            default:
                System.out.println("Please enter right choice");
                break;
        }

    }
    public static void removeDuplicateCharacterUsingInbuiltMethods(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        System.out.println("before removing duplicate characters: "+str);
        System.out.print("after removing duplicate characters: ");
        for(char ch: str.toCharArray()){
            if(!set.contains(ch) || ch == ' '){
                set.add(ch);
                System.out.print(ch);
                result.append(ch);
            }
        }

        System.out.println("\nusing string builder: "+ result);

    }

    public static void removeDuplicateCharacterUsingManualMethods(String str){
        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i<str.length() ;i++){
            char ch = str.charAt(i);
            boolean duplicate = false;
            for(int j = 0 ;j < str.length() ; j++){
                if(ch == str.charAt(j)){
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                result.append(ch);
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("After Removing Duplicates: " + result);
    }
}
