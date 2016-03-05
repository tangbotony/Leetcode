package com.tangbo.exercise.plusone;
/*
 * 66. Plus One My Submissions Question
	Total Accepted: 89217 Total Submissions: 271500 Difficulty: Easy
	Given a non-negative number represented as an array of digits, plus one to the number.
	
	The digits are stored such that the most significant digit is at the head of the list.
	
	Subscribe to see which companies asked this question
	
	Show Tags
	Show Similar Problems
 */
public class Solution {
	public int[] plusOne(int[] digits) {
        boolean flag = false;
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]!=9)
            {
               digits[i] = digits[i]+1;
               return digits;
            }else
            {
                digits[i] = 0;
                if(i==0)
                    flag = true;
            }
        }
        if(flag == true)
        {
            int result[] =  new int[digits.length+1];
            result[0] = 1;
            return result;
        }
        return null;//随便返回即可
    }
}