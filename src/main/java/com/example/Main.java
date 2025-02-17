package com.example;

import com.example.JavaAlgorithmicTasks.third.SingleNumber;
import com.example.codewars.*;

public class Main {
    public static void main(String[] args) {
        /*PalindromeNumber p = new PalindromeNumber();
        p.isPalindrome();
        TwoSum twoSum = new TwoSum();
        twoSum.findSolution();
        SpinningWords sw = new SpinningWords("This sentence is a sentence");
        sw.spinWords();
        NarcissisticNumber.isNarcissistic(1634);
        ExesAndOhs XO = new ExesAndOhs();
        XO.XO("xxooo");*/
        //System.out.println(InOrderPlease.order("is2 Thi1s T4est 3a"));
        //System.out.println(new Multiples3or5().solution(16));
        //System.out.println(new CountingDuplicates().duplicateCount("Indivisibilities"));

        SingleNumber sn = new SingleNumber(new int[]{5, 5, 6, 6, 7, 8, 7});
        sn.singleNumber();
    }
}