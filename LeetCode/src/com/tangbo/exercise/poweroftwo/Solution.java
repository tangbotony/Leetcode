package com.tangbo.exercise.poweroftwo;
/*
 * 231. Power of Two My Submissions Question
	Total Accepted: 58883 Total Submissions: 166177 Difficulty: Easy
	Given an integer, write a function to determine if it is a power of two.
	
	Credits:
	Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
    	if(n==0 || n==1)
    		return false;
    	while(n>2)
    		n=n>>1;
    	if(n==2)
    		return false;
    	else
    		return false;
    }
    public static void main(String[] args) {
		System.out.println(5>>1);
	}
}