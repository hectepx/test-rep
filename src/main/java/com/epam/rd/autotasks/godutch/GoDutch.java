package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {

        System.out.println("Enter the number of friends and the account amount");

        Scanner scanFriend = new Scanner(System.in);
        Scanner scanAmount = new Scanner(System.in);
        int friend = scanFriend.nextInt();
        int amount = scanAmount.nextInt();
        int part;


       if (friend <= 0){
           System.out.println("Number of friends cannot be negative or zero");
       }
       else if (amount < 0) {
           System.out.println("Bill total amount cannot be negative");
       }
       else {
           part = (amount  + (amount / 10))/friend;
           System.out.println(part);
       }



//        if (friend > 0 && amount >= 0) {
//            part = (amount  + (amount / 10))/friend;
//            System.out.println(part);
//        } else {
//            if (amount < 0) {
//                System.out.println("Bill total amount cannot be negative");
//            } else if (friend <= 0){
//                System.out.println("Number of friends cannot be negative or zero");
//            }
//        }

    }
}
