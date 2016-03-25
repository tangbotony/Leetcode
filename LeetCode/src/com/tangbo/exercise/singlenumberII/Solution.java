package com.tangbo.exercise.singlenumberII;
/*
 * 137. Single Number II My Submissions Question
	Total Accepted: 79058 Total Submissions: 211951 Difficulty: Medium
	Given an array of integers, every element appears three times except for one. Find that single one.
	
	Note:
	Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
	
	Subscribe to see which companies asked this question
	
	Show Tags
	Show Similar Problems

 */
public class Solution {
    public int singleNumber(int[] nums) {
        int one = 0,two = 0,three = 0;
        for(int i : nums)
        {
            three = two & i;
            two = two | one & i;
            one = one | i;
            two = two & ~three;
            one = one & ~three;
        }
        return one;
    }
}
