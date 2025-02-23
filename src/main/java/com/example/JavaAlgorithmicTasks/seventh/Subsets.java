package com.example.JavaAlgorithmicTasks.seventh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        result.add(subset);

        for (int i = 0; i < nums.length; i++) {
            int N = result.size();
            for (List<Integer> it: result){
                subset = new ArrayList<>(it);
                subset.add(nums[i]);
                res.add(subset);
                N--;
                if (N == 0) break;
            }
            result.addAll(res);
            res.clear();
        }
        return new ArrayList<>(result);
    }
}
