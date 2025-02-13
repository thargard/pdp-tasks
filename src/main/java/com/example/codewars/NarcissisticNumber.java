package com.example.codewars;

public class NarcissisticNumber {
    public static void isNarcissistic(int number){
        String num = Integer.toString(number);
        int newNum = 0;
        for (int i = 0; i < num.length(); i++) {
            int res= Integer.parseInt("" + num.charAt(i));
            newNum += pow(res, num.length());
        }
        if (number == newNum){
            System.out.println("It is a narcissistic number");
        } else {
            System.out.println("It is not a narcissistic number");
        }
    }

    public static int pow(int a, int b){
        int res = 1;
        for (int i = 0; i < b; i++){
            res *= a;
        }
        return res;
    }
}
