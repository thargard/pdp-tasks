package com.example.JavaAlgorithmicTasks.nineth;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        int[] dp = new int[s.length() + 1];
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = ( i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i + 1] +((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                count = Math.max(count, dp[i]);
            }
        }
        return count;
    }
}
