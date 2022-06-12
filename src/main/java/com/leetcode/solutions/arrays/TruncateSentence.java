package com.leetcode.solutions.arrays;

public class TruncateSentence {
    public static void main(String[] args) {
        String s = "chopper is not a tanuki";
        int k = 3;
        System.out.println(truncateSentence(s,k));
    }

    public static String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<k;i++){
            newStr.append(str[i] +" ");
        }
        return newStr.toString().trim();
    }
}
