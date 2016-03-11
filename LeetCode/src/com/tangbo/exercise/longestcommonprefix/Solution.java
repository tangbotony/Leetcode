package com.tangbo.exercise.longestcommonprefix;
/*
 * 14. Longest Common Prefix My Submissions Question
	Total Accepted: 90191 Total Submissions: 326453 Difficulty: Easy
	Write a function to find the longest common prefix string amongst an array of strings.
	
	Subscribe to see which companies asked this question
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String result="";
        int index=0;
        String temp="";
        while(true)
        {
            for(int i=0;i<strs.length;i++)
            {
                if(index>(strs[i].length()-1))
                    return result;
                if(temp.length() == 0)
                    temp = strs[i].charAt(index)+"";
                else
                {
                    if(!temp.equals(strs[i].charAt(index)+""))
                        return result;
                }
            }
            result = result + temp;
            temp = "";
            index++;
        }
    }
}