package com.tangbo.exercise.implementstrstr;
/*
 * 28. Implement strStr() My Submissions Question
	Total Accepted: 97667 Total Submissions: 398565 Difficulty: Easy
	Implement strStr().
	
	Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
	
	Subscribe to see which companies asked this question
	
	Show Tags
	Show Similar Problems

 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                if(i+needle.length()>haystack.length())
                    return -1;
                int j=0;
                for(j=0;j<needle.length();j++)
                {
                    if(haystack.charAt(i+j)!=needle.charAt(j))
                        break;
                }
                if(j==needle.length())
                    return i;
            }
        }
        return -1;
    }
}