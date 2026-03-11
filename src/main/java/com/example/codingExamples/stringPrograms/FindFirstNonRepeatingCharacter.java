package com.example.codingExamples.stringPrograms;

import java.util.*;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to find out first non-repeating character:");
        String str = sc.nextLine();

        LinkedHashMap<Character , Integer> map = new LinkedHashMap<>();
        for(Character ch: str.toCharArray()){
               Integer value = map.getOrDefault(ch , 0);
               map.put(ch , ++value);
        }

//      iterate using for loop
        for(Map.Entry<Character , Integer> entry :map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("first non repeating character is "+ entry.getKey());
                break;
            }
        }

//        iterating using keySet
/*       for(Character ch :map.keySet()){
            if(map.get(ch) == 1){
                System.out.println("first non repeating character is "+ ch);
            }
        }
*/

//        iterate using for each lopp
/*        map.forEach((key, value)->{
            if(value == 1){
                System.out.println("first non repeating character is "+key);
            }
        });
*/

//      iterate using iterator
/*      Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Character, Integer> entry = iterator.next();
            if(entry.getValue() == 1){
                System.out.println("first non repeating character is "+ entry.getKey());
            }
        }
*/

    }
}
