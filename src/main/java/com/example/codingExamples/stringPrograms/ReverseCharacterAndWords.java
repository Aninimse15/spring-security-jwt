package com.example.codingExamples.stringPrograms;

import java.util.Scanner;

public class ReverseCharacterAndWords {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to Reverser Words or character in sentence :\n1.Word\n2.Character\n3.reverse character inside word");
        int wordOrCharacterChoice = sc.nextInt();

        System.out.println("Do you want to continue with which method:\n1.Inbuilt\n2.Manual");
        int methodChoice = sc.nextInt();
        sc.nextLine();

        System.out.println("Please Enter sentence to reverse");
        String sentence = sc.nextLine().trim();

        String revesedString = null ;
        switch (methodChoice){
            case 1 :
                revesedString = reverseStringUsingInbuiltMethod(wordOrCharacterChoice,sentence);
                break;
            case 2:
                revesedString = reverseStringUsingManualMethod(wordOrCharacterChoice,sentence);
                break;
            default:
                System.out.println("Wrong choice:");
                break;
        }
        System.out.println("Reversed sentence :" +revesedString);
    }

    public static String reverseStringUsingInbuiltMethod(int wordOrCharacterChoice,String sentence){
        sentence = sentence.trim();
        return  switch (wordOrCharacterChoice){
            case 1 -> reverseWordsUsingInbuiltMethod(sentence);
            case 2 -> reverseCharacterUsingInbuiltMethod(sentence);
            case 3 -> reverseCharactersInsideWordByInbuiltMethod(sentence);
            default ->{
                System.out.println("Enter wrong choice");
                yield null;
            }
        };
    }

    public static String reverseWordsUsingInbuiltMethod(String sentence){
        String[] wordsArray = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();
        for(int i = wordsArray.length-1 ;i >=0; i--){
           reversedSentence.append(wordsArray[i]);
           if(i > 0){
               reversedSentence.append(" ");
           }
        }
        return reversedSentence.toString();
    }

    public static String reverseCharacterUsingInbuiltMethod(String sentence){
        return new StringBuilder(sentence).reverse().toString();
    }

    public static String reverseStringUsingManualMethod(int wordOrCharacterChoice,String sentence){
        sentence = sentence.trim();
        return  switch (wordOrCharacterChoice){
            case 1 -> reverseWordsUsingManualMethod(sentence);
            case 2 -> reverseCharacterUsingManualMethod(sentence);
            case 3 -> reverseCharactersInsideWordByManualMethod(sentence);
            default ->{
                System.out.println("Enter wrong choice");
                yield null;
            }
        };
    }

    public static String reverseWordsUsingManualMethod(String sentence){
        String reversedSentence = "";
        String word = "" ;
        for(int i= sentence.length()-1 ; i >= 0 ; i--){
            char c =sentence.charAt(i);
            if(c != ' '){
                word = c + word;
            }else{
                reversedSentence = reversedSentence + word + " ";
                word = "";
            }
        }
        return reversedSentence + word;

//        using string builder
       /*
        StringBuilder reversedSentence = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for(int i= sentence.length()-1 ; i >= 0 ; i--){
            char c =sentence.charAt(i);
            if(c != ' '){
                word.insert(0, c);
            }else{
                reversedSentence.append(word).append(" ");
                word = new StringBuilder();
            }
        }
        return reversedSentence.toString() + word;
        */

    }

    public static String reverseCharacterUsingManualMethod(String sentence){
        String reversedWord = "";
        for( int i = sentence.length()-1 ; i>=0 ; i--){
            reversedWord =  reversedWord + sentence.charAt(i);
        }
        return reversedWord;

//        using StringBuilder
        /*
        StringBuilder reversedWord = new StringBuilder();
        for( int i = sentence.length()-1 ; i>=0 ; i--){
            reversedWord.append(sentence.charAt(i));
        }
        return reversedWord.toString();
         */
    }

    public static String reverseCharactersInsideWordByManualMethod(String sentence){
        String word = "";
        String reversedSentence = "";
        for(int i = 0 ;i< sentence.length();i++){
            char c = sentence.charAt(i);
            if(c != ' '){
                word = c + word;
            }else{
                reversedSentence = reversedSentence + word+ " ";
                word = "";
            }
        }
        return reversedSentence + word;
    }

    public static String reverseCharactersInsideWordByInbuiltMethod(String sentence){
        StringBuilder reverseString = new StringBuilder();
        String[] wordsArray = sentence.trim().split("\\s+");
        for(int i = 0 ; i < wordsArray.length ;i++){
            reverseString.append(new StringBuilder(wordsArray[i].trim()).reverse());
            if(i != wordsArray.length-1){
                reverseString.append(" ");
            }
        }
        return reverseString.toString();
    }
}
