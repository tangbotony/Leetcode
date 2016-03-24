package com.tangbo.exercise.singlenumber;
/*
 * 136. Single Number My Submissions Question
	Total Accepted: 120618 Total Submissions: 245250 Difficulty: Medium
	Given an array of integers, every element appears twice except for one. Find that single one.
	
	Note:
	Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
	
	Subscribe to see which companies asked this question
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int n : nums)
            result^=n;
        return result;
    }
}