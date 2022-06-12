package com.leetcode.solutions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallerThanCurrentInArray {
    public static void main(String[] args) {
        int[] nums = {7,8,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    static public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(j!=i && nums[j] < nums[i]){
                    count++;
                }
            }
            list.add(count);
        }
        return list.stream().mapToInt(k->k).toArray();
    }
}
