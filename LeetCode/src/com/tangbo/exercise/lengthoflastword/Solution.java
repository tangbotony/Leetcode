package com.tangbo.exercise.lengthoflastword;
/*
 * 58. Length of Last Word My Submissions Question
	Total Accepted: 85499 Total Submissions: 296195 Difficulty: Easy
	Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
	
	If the last word does not exist, return 0.
	
	Note: A word is defined as a character sequence consists of non-space characters only.
	
	For example, 
	Given s = "Hello World",
	return 5.
	
	Subscribe to see which companies asked this question
 */
public class Solution {
    public int lengthOfLastWord(String s) {
    	s = s.trim();
        if(s.length()==0)
            return 0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if((s.charAt(i)+"").equals(" "))
                return s.length()-1-i;
        }
        return s.length();
    }
}
