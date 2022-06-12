package com.leetcode.solutions.arrays;

public class CountPrefixesInString {
    public static void main(String[] args) {
        String[] words = {"a","a"};
        String s = "aa";
        System.out.println(countPrefixes(words, s));
    }

    static public int countPrefixes(String[] words, String s) {
        String[] prefixArr = new String[s.length()];
        for(int i=0;i<s.length();i++){
            prefixArr[i] = s.substring(0,s.length()-i);
        }
        int count = 0;
        for(String word : words){
            for(String prefix: prefixArr){
                if(word.contentEquals(prefix)){
                    count++;
                }
            }
        }
        return count;
    }
}
