package com.leetcode.solutions.arrays;

public class MergeStringAlternatively {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1,word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        int lenWord1 = word1.length();
        int lenWord2 = word2.length();
        int min = Math.min(lenWord1,lenWord2);
        StringBuilder mergedString = new StringBuilder();
       for(int i=0;i<min;i++){
           mergedString.append(word1.charAt(i));
           mergedString.append(word2.charAt(i));
       }
       if(lenWord1 >= min){
           mergedString.append(word1.substring(min));
       }
        if(lenWord2 >= min){
            mergedString.append(word2.substring(min));
        }
        return mergedString.toString().trim();
    }

}
