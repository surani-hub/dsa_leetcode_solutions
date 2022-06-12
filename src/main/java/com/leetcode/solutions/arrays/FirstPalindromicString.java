package com.leetcode.solutions.arrays;

public class FirstPalindromicString {
    public static void main(String[] args) {
        FirstPalindromicString obj = new FirstPalindromicString();
        String[] words = {"def","aba","ghi"};
        System.out.println(obj.firstPalindrome(words));
    }

    public String firstPalindrome(String[] words) {
        for(String word : words){
            StringBuilder reversed = new StringBuilder(word);
            reversed.reverse();
            if(reversed.toString().equals(word)){
                return word;
            }
        }
        return "";
    }
}
