package com.example.codewars;

import java.util.Arrays;
import java.util.Comparator;

public class InOrderPlease {
    public static String order(String words) {
        String[] word = words.split(" ");
        Arrays.sort(word, Comparator.comparing(s -> Integer.valueOf(s.replaceAll("[^0-9]", ""))));
        return String.join(" ", word);
    }
}
