package com.tangbo.exercise.excelsheetcolumntitle;
/*
 * 168. Excel Sheet Column Title My Submissions Question
	Total Accepted: 55649 Total Submissions: 261954 Difficulty: Easy
	Given a positive integer, return its corresponding column title as appear in an Excel sheet.
	
	For example:
	
	    1 -> A
	    2 -> B
	    3 -> C
	    ...
	    26 -> Z
	    27 -> AA
	    28 -> AB 
	Credits:
	Special thanks to @ifanchu for adding this problem and creating all test cases.
	
	Subscribe to see which companies asked this question
	
	Show Tags
	Show Similar Problems

 */
public class Solution {
    public String convertToTitle(int n) {
        String ret = "";
        while(n>0)
        {
            ret = (char)((n-1)%26+'A') + ret;
            n = (n-1)/26;
        }
        return ret;
    }
}