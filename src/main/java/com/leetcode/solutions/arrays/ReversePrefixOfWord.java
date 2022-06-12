package com.leetcode.solutions.arrays;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String word = "abcdedc";
        char ch = 'e';
        System.out.println(reversePrefix(word,ch));
    }

    public static String reversePrefix(String word, char ch) {
        int firstOcr = word.indexOf(ch);
        String str = word.substring(0,firstOcr+1);
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.append(word.substring(firstOcr+1)).toString();

    }
}
