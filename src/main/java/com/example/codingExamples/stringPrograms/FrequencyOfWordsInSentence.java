package com.example.codingExamples.stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfWordsInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence to calculate words in sentence");
        String sentence = sc.nextLine().trim();

        sentence = sentence.toLowerCase();

        if(sentence.isEmpty()){
            System.out.println("sorry! empty sentence.");
            return;
        }

        String[] words = sentence.split("\\s+");

        LinkedHashMap<String , Integer> wordFrequencyMap = new LinkedHashMap<>();

        for(String word: words){
            wordFrequencyMap.put(word , wordFrequencyMap.getOrDefault(word , 0)+1);
        }

        for(Map.Entry<String,Integer> m : wordFrequencyMap.entrySet()){
            System.out.println(m.getKey() + " --> " + m.getValue());
        }
    }
}
