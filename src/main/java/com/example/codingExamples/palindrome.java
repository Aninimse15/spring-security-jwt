package com.example.codingExamples;

import java.util.Scanner;

public class palindrome {

    public static void main (String[] args){
        int checkAgain= 1;
        do{
            System.out.println("Enter the String to check palindrome");
            String str = new Scanner(System.in).nextLine().trim();

            System.out.println("Enter want to do palindrome using inbuilt or manual method:\n1.Inbluilt method \n2.Manual method");
            int choice = new Scanner(System.in).nextInt();


            Boolean result = null ;

            switch (choice){
                case 1 :
                    result = getPalindromeUsingInBuiltMethod(str);
                    break;
                case 2:
                    result = getPalindromeUsingManualChecking(str);
                    break;
                default:
                    System.out.println("Enter wrong choice");
                    break;
            }
            if(result != null && result){
                System.out.println("palindrome string");
            }
            else{
                System.out.println("Not a palindrome String");
            }
            System.out.println("Want to test more palindrome strings:\n1.Yes \n2.No ");
            checkAgain = new Scanner(System.in).nextInt();
        }while(checkAgain != 2);

        System.out.println("Thank you...");

    }

    public static Boolean getPalindromeUsingInBuiltMethod(String str){
        return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    }

    public static Boolean getPalindromeUsingManualChecking(String str){
        int left = 0 ;
        int right = str.length()-1;

        System.out.println("length calculated using inbuilt function :"+right);
        System.out.println("length calculated using manually:"+getStringLength(str));

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
}
