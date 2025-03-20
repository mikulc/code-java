package com.algorithm.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.两数之和 | 难度：简单
 * 给定一个整数数组 nums 和一个整数目标值 target
 * 请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 *
 * @author mikulc
 * @since 2025-03-17
 */
class SolutionTwoSum1 {
    // 暴力枚举
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}

class SolutionTwoSum2 {
    // 哈希表
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}