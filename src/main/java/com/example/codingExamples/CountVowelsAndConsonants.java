package com.example.codingExamples;

import java.util.Scanner;

public class CountVowelsAndConsonants {

    public record countVowelsAndConsonants(int vowels,int consonants){};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to count vowels and consonants");
        String sentence = sc.nextLine().trim().toLowerCase();

        System.out.println("Want to find out using(Enter choice 1 / 2): \n1.Inbuilt\n2.Manual");
        int choice = sc.nextInt();
        countVowelsAndConsonants vowelsAndConsonants = new countVowelsAndConsonants(0 , 0);
        switch (choice){
            case 1 :
                vowelsAndConsonants =  getVowelsAndConsonantsUsingInbuiltMethod(sentence);
                break;
            case 2:
                vowelsAndConsonants =  getVowelsAndConsonantsUsingManualMethod(sentence);
                break;
            default:
                System.out.println("You have entered wrong choice");
                break;
        }

        System.out.println("sentence ---> "+sentence);
        System.out.println("Vowels :"+ vowelsAndConsonants.vowels +" consonants :" + vowelsAndConsonants.consonants);
    }

    public static countVowelsAndConsonants getVowelsAndConsonantsUsingInbuiltMethod(String sentence) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if ('a' == ch || 'e' == ch || 'i' == ch || 'o' == ch || 'u' == ch) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return  new countVowelsAndConsonants(vowels,consonants);
    }

    public static countVowelsAndConsonants getVowelsAndConsonantsUsingManualMethod(String sentence) {
        int vowels = 0;
        int consonants = 0;
        for(char ch : sentence.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch) != -1){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        return  new countVowelsAndConsonants(vowels,consonants);
    }


}
