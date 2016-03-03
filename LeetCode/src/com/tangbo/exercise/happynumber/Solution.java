package com.tangbo.exercise.happynumber;
/*
 * 202. Happy Number My Submissions Question
	Total Accepted: 57337 Total Submissions: 159989 Difficulty: Easy
	Write an algorithm to determine if a number is "happy".
	
	A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
	
	Example: 19 is a happy number
	
	12 + 92 = 82
	82 + 22 = 68
	62 + 82 = 100
	12 + 02 + 02 = 1
 */

import java.util.HashSet;
import java.util.Set;

public class Solution {
	Set<Integer> count = new HashSet<>();
    public boolean isHappy(int n) {
        if(n == 1)
        	return true;
        String nString = n+"";
        int sum = 0;
        for(int i=0;i<nString.length();i++)
        {
        	sum = Integer.parseInt(nString.charAt(i)+"")*Integer.parseInt(nString.charAt(i)+"")+sum;
        }
        if(!count.add(sum))
        	return false;
        return isHappy(sum);
    }
}