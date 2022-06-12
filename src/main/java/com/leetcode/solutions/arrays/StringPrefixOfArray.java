package com.leetcode.solutions.arrays;

public class StringPrefixOfArray {
    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"apples","i","love","leetcode"};
        System.out.println(isPrefixString(s,words));
    }

    static public boolean isPrefixString(String s, String[] words) {
        String[] prefixArr = new String[words.length];
        for(int i=0;i<words.length;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<=i;j++){
                prefixArr[i] = sb.append(words[j]).toString();
            }
        }
        for(String prefix: prefixArr){
            if(prefix.contentEquals(s)){
                return true;
            }
        }
        return false;
    }
}
