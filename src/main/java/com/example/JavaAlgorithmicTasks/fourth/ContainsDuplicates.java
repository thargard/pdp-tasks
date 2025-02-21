package com.example.JavaAlgorithmicTasks.fourth;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
