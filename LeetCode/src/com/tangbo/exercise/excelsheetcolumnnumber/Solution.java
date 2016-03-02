package com.tangbo.exercise.excelsheetcolumnnumber;
/*
 * 171. Excel Sheet Column Number My Submissions Question
	Total Accepted: 67504 Total Submissions: 166544 Difficulty: Easy
	Related to question Excel Sheet Column Title
	
	Given a column title as appear in an Excel sheet, return its corresponding column number.
	
	For example:
	
	    A -> 1
	    B -> 2
	    C -> 3
	    ...
	    Z -> 26
	    AA -> 27
	    AB -> 28 
 */
public class Solution {
    public int titleToNumber(String s) {
    	int result = 0;
    	byte temp [] = s.getBytes();
    	for(int i=temp.length-1; i>=0;i--)
    	{
    		result =result+ (int) Math.pow(26, (temp.length-1-i))*(temp[i]-64);
    	}
        return result;
    }
}
