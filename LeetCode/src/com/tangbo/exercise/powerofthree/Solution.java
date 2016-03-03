package com.tangbo.exercise.powerofthree;
/*
 * 326. Power of Three My Submissions Question
	Total Accepted: 24181 Total Submissions: 67627 Difficulty: Easy
	Given an integer, write a function to determine if it is a power of three.
	
	Follow up:
	Could you do it without using any loop / recursion?
 */
public class Solution {
	private static final double epsilon = 10e-15;
    public boolean isPowerOfThree(int n) {
    	if(n == 0)
    		return false;
    	double result = Math.log(n)/Math.log(3);	
        return Math.abs(result-Math.round(result)) < epsilon;//java的浮点数造成的
    }
}