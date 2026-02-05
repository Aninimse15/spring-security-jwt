package com.example.javaStudy.solidPrinciples.SRP.service;

public class problemOfSolidPrincipleIssueForSRP {
    /**
     * this clas contains all functionality handled using single class so changes in any functionality need to modify this class
     * so SRP resolve this issue using creating separte service for every functionality.
    */
    public Long deposit(Long amount, String accNo){
        return amount;
    }

    public Long withdraw(Long amount,String accNo){
        return amount;
    }

    public void printPassbook(){
        //logic for printing
    }

    public void notification(String provider){
        //logic for send notification
        if(provider.equals("mobile")){
            //logic to send on sms
        }
        if(provider.equals("email")){
            //logic to send over email
        }
    }

    public void calculateLoan(Long amount){
        //logic to calculate loan amount
    }
}
