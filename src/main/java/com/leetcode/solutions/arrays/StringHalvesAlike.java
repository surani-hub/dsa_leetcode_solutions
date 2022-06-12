package com.leetcode.solutions.arrays;

public class StringHalvesAlike {
    public static void main(String[] args) {
        StringHalvesAlike obj = new StringHalvesAlike();
        String s = "textbook";
        System.out.println(obj.halvesAreAlike(s));
    }

    public boolean halvesAreAlike(String s) {
        int len = s.length();
        int half = len / 2;
        String a = s.substring(0,half);
        String b = s.substring(half);
        int aVowelCount = countVowel(a);
        int bVowelCount = countVowel(b);
        if(aVowelCount == bVowelCount){
            return true;
        }
        return false;
    }

    public int countVowel(String s){
        int count  = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
                    || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                count++;
            }
        }
        return count;
    }
}
