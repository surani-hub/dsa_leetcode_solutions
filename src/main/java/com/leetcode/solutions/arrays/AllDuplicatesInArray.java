package com.leetcode.solutions.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(findDuplicates(nums));
    }

    static public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int num:nums){
            if(!set.contains(num)){
                set.add(num);
            }else {
                list.add(num);
            }
        }
        return list;
    }
}
