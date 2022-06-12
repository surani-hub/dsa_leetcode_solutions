package com.leetcode.solutions.arrays;

import java.util.Arrays;

public class TwoSUm {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i = 0; i<nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
                if((nums[i] + nums[j]) == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}
