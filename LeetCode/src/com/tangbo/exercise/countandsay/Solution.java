package com.tangbo.exercise.countandsay;
/*
 * 38. Count and Say My Submissions Question
	Total Accepted: 73941 Total Submissions: 261485 Difficulty: Easy
	The count-and-say sequence is the sequence of integers beginning as follows:
	1, 11, 21, 1211, 111221, ...
	
	1 is read off as "one 1" or 11.
	11 is read off as "two 1s" or 21.
	21 is read off as "one 2, then one 1" or 1211.
	Given an integer n, generate the nth sequence.
	
	Note: The sequence of integers will be represented as a string.
	
	Subscribe to see which companies asked this question
 */
public class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        String star = get("1");
        for(int i=1;i<n-1;i++)
        {
            star = get(star);
        }
        return star;
    }
    public String get(String star)
    {
        String result="";
        String index="";
        int count=1;
        for(int i=0;i<star.length();i++)
        {
            if(index.length()==0)
            {
                index = star.charAt(i)+"";
                count =1;
                continue;
            }
            if((star.charAt(i)+"").equals(index))
            {
                count++;
            }else
            {
                result = result+count+index;
                index = star.charAt(i)+"";
                count =1;
            }
        }
        result = result+count+index;
        return result;
    }
}