package com.example.codingExamples;

import java.util.*;
import java.util.stream.Collectors;

public class findDuplicateCharactersInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to find out duplicate character:");
        String word = sc.nextLine().trim().toLowerCase();

        System.out.println("Want to find out using(Enter choice 1 / 2): \n1.Inbuilt\n2.Manual\n3.Stream api");
        int choice = sc.nextInt();

        switch (choice){
            case 1 :
                findDuplicateCharactersInsideSentenceUsingInbuilt(word);
                break;
            case 2:
                findDuplicateCharactersInsideSentenceUsingManual(word);
                break;
            case 3:
                findDuplicateCharactersInsideSentenceUsingStream(word);
                break;
            default:
                System.out.println("You have entered wrong choice");
                break;
        }

    }

    public static void findDuplicateCharactersInsideSentenceUsingManual(String word){
        char[] charArray = word.toCharArray();
        boolean[] visited = new boolean[charArray.length];

        for(int i = 0 ;i < charArray.length ; i++){
            int count = 0;
            for(int j = i+1 ; j < charArray.length ; j++){
                if (visited[i] || charArray[i] == ' ') continue;
                if(charArray[i] == charArray[j]){
                    visited[j] = true;
                    count++;
                }
            }
            if(count >= 1){
                System.out.print(word.charAt(i) +" ");
            }
        }
    }

    public static void findDuplicateCharactersInsideSentenceUsingInbuilt(String word){
        Map<Character,Integer> characterIntegerMap = new LinkedHashMap<>();
        
        for(char ch: word.toCharArray()){
            if(ch == ' ') continue;
            characterIntegerMap.put(ch , characterIntegerMap.getOrDefault(ch , 0)+1);
        }
        System.out.print("Duplicate alphabets in sentence :");
        for(Map.Entry<Character,Integer> entry : characterIntegerMap.entrySet()){
            if(entry.getValue() > 1) System.out.print(entry.getKey() + " ");
        }
    }

    public static void findDuplicateCharactersInsideSentenceUsingStream(String word){
        Map<Character, Long> map = word.chars().mapToObj(c -> (char) c).filter(c-> c != ' ').collect(Collectors.groupingBy(c->c , Collectors.counting()));
//        use linkedHashmap to store in order like below
//        Map<Character, Long> map = word.chars().mapToObj(c -> (char) c).filter(c-> c != ' ').collect(Collectors.groupingBy(c->c ,LinkedHashMap::new, Collectors.counting()));
        System.out.print("duplicate alphabets in sentence :");
        map.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(e-> System.out.print(e.getKey()+" "));
    }
}
