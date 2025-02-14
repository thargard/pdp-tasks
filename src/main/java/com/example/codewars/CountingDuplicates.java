package com.example.codewars;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public int duplicateCount(String text) {
        Map<Character, Integer> charCount = new HashMap<>();
        int count = 0;
        for (char c: text.toLowerCase().toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (int i: charCount.values()) if (i > 1) count++;
        return count;
    }
}
