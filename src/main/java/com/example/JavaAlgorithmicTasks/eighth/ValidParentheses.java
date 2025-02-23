package com.example.JavaAlgorithmicTasks.eighth;

public class ValidParentheses {
    public static boolean isValid(String s) {
        return countParentheses(s, '(') & countParentheses(s, '[') & countParentheses(s, '{');
    }

    public static boolean countParentheses(String s, char c){
        char reverseChar = getReverseParenthesis(c);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) count++;
            else if (s.charAt(i) == reverseChar) count--;
            if (count < 0) return false;
        }
        return count == 0;
    }


    public static char getReverseParenthesis(char c){
        return switch (c) {
            case '(' -> ')';
            case '{' -> '}';
            case '[' -> ']';
            default -> c;
        };
    }
}
