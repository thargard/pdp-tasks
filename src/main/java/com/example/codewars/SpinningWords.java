package com.example.codewars;

public class SpinningWords {
    public String sentence;

    public SpinningWords(String sentence) {
        this.sentence = sentence;
    }

    public void spinWords(){
        String[] words = sentence.split(" ");
        StringBuilder res = new StringBuilder();
        for (String word: words){
            if (word.length() >= 5) {
                res.append(new StringBuilder(word).reverse().toString()).append(" ");
            } else {
                res.append(word).append(" ");
            }
        }
        System.out.println(res.toString().trim());
    }
}
