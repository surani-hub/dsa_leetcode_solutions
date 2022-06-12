package com.leetcode.solutions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndicesAfterSorting {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3,4,5,6,5};
        int target = 5;
        System.out.println(targetIndices(nums,target));
    }

   static public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                list.add(i);
            }
        }
        return list;
    }
}
