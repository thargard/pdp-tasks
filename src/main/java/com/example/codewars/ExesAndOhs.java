package com.example.codewars;

public class ExesAndOhs {
    public void XO(String str){
        String answer = countX(str) == countO(str) ? "true" : "false";
        System.out.println(answer);
    }

    public long countX(String str){
        return str.toLowerCase().chars().filter(x -> x == 'x').count();
    }

    public long countO(String str){
        return str.chars().filter(x -> x == 'o').count();
    }
}
