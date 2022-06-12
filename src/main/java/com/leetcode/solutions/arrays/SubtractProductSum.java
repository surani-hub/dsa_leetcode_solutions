package com.leetcode.solutions.arrays;

public class SubtractProductSum {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }

    static public int subtractProductAndSum(int n) {
        int prod = product(n);
        int sum = sum(n);
        return prod-sum;
    }

    public static int product(int n){
        int prod = 1;
        while(n>0){
            int rem = n % 10;
            prod *= rem;
            n /= 10;
        }
        return prod;
    }

    public static int sum(int n){
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }
}
