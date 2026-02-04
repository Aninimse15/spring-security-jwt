package com.example.codingExamples;

import java.util.Scanner;

public class Palindrome {

    public static Scanner sc = new Scanner(System.in);
    public static final String yes = "yes";
    public static final String no = "no";

    public static void main (String[] args){

        String checkAgain= yes;
        do{
            System.out.println("Do you want to find out palindrome by which method (Enter 1 or 2):\n1.Inbluilt method \n2.Manual method");
            int choice = sc.nextInt();
            sc.nextLine();

            Boolean result = getPalindrome(choice);
            if(result == null) continue;

            if(result){
                System.out.println("palindrome string");
            }else {
                System.out.println("Not a palindrome String");
            }

            checkAgain = wantToContinueOrExit();

        }while(checkAgain.equalsIgnoreCase(yes));

        System.out.println("Thank you...");

    }

    public static Boolean getPalindrome(int choice){
        return switch (choice) {
            case 1 -> getPalindromeUsingInBuiltMethod();
            case 2 -> getPalindromeUsingManualChecking();
            default -> {
                System.out.println("Please enter right method\n-------------------------------------------------------------");
                yield null;
            }
        };
    }

    public static boolean getPalindromeUsingInBuiltMethod(){
        String str = takeStringInput();
        return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    }

    public static String takeStringInput(){
        System.out.println("Enter the String to check palindrome");
        String str = sc.nextLine().trim();
        System.out.println("-------------------------------------------------------------");
        return  str;
    }

    public static boolean getPalindromeUsingManualChecking(){
        String str = takeStringInput();
        int length = getStringLength(str);
        int left = 0 ;
        int right = str.length()-1;

//        System.out.println("length calculated using inbuilt function :"+str.length());
//        System.out.println("length calculated using manually:"+getStringLength(str));

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static int getStringLength(String str){
        //option 1
        int count= 0;
        for(char c: str.toCharArray())
            count++;
        return  count ;

        //option 2:
        /*
                int i= 0;
                while (true) {
                    try {
                        str.charAt(i);
                        i++;
                    } catch (Exception e) {
                        break;
                    }
                }
         */
    }

    public static String wantToContinueOrExit(){
        String checkAgain;
        do {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Want to test more palindrome strings?\nYes / No");
            checkAgain = new Scanner(System.in).nextLine();
        }while(!(checkAgain.equalsIgnoreCase(yes) || checkAgain.equalsIgnoreCase(no)));
        System.out.println("-------------------------------------------------------------");
        return checkAgain;
    }
}
