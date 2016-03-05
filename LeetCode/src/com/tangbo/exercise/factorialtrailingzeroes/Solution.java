package com.tangbo.exercise.factorialtrailingzeroes;
/*
 * 172. Factorial Trailing Zeroes My Submissions Question
	Total Accepted: 52057 Total Submissions: 162830 Difficulty: Easy
	Given an integer n, return the number of trailing zeroes in n!.
	
	Note: Your solution should be in logarithmic time complexity.
	
	Credits:
	Special thanks to @ts for adding this problem and creating all test cases.
	
	Subscribe to see which companies asked this question
	
	Show Tags
	Show Similar Problems
 */
public class Solution {
	public int trailingZeroes(int n) {
        int result = 0;
        while(n>4)
        {
            n=n/5;
            result = result + n;
        }
        return result;
    }
}
