package com.example.JavaAlgorithmicTasks.third;

import java.util.Arrays;

public class SingleNumber {
    public int[] nums;

    public SingleNumber(int[] nums) {
        this.nums = nums;
    }

    public void singleNumber() {
        int unique = Arrays.stream(nums).reduce((num1, num2) -> num1 ^ num2).orElseThrow();
        System.out.println("Unique number: " + unique);
    }
}
