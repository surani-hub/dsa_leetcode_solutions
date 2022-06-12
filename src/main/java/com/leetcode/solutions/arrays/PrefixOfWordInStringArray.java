package com.leetcode.solutions.arrays;

public class PrefixOfWordInStringArray {
    public static void main(String[] args) {
        String sentence = "i am tired";
        String searchWord = "you";
        System.out.println(isPrefixOfWord(sentence,searchWord));
    }

    static public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}
