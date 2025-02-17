package com.example.JavaAlgorithmicTasks.fifth;

public class SearchInsertPosition {
    public int[] nums;
    public int target;

    public SearchInsertPosition(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    public int searchInsertPosition() {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
