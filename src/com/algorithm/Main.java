package com.algorithm;

import com.concepts.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 9};
        int target = 6;
        int[] res = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
