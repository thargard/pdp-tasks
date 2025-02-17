package com.example.JavaAlgorithmicTasks.fourth;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public int[] nums;

    public ContainsDuplicates(int[] nums) {
        this.nums = nums;
    }

    public boolean containsDuplicates() {
        Set<Integer> set = new HashSet<>();
        return Arrays.stream(nums).anyMatch(n -> !set.add(n));
    }
}
