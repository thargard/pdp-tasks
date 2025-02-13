package com.example.JavaAlgorithmicTasks.palindrome;

import java.util.Scanner;

public class PalindromeNumber {
    public String number;

    public void isPalindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        number = sc.nextLine();
        //System.out.println(number);
        String reverseNUmber = new StringBuilder(number).reverse().toString();
        if(number.equals(reverseNUmber)){
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
