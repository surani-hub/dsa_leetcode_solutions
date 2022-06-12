package com.leetcode.solutions.arrays;

public class SplitSptringInBalancedStrings {
    public static void main(String[] args) {
        SplitSptringInBalancedStrings obj = new SplitSptringInBalancedStrings();
        String s = "LLLLRRRRLRLR";
        System.out.println(obj.balancedStringSplit(s));
    }

    public int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                balance++;
            }else if(s.charAt(i) == 'R'){
                balance--;
            }
            if(balance == 0){
                count++;
            }
        }
        return count;
    }
}
