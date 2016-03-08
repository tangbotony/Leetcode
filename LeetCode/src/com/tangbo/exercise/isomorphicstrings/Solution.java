package com.tangbo.exercise.isomorphicstrings;
/*
 * 205. Isomorphic Strings My Submissions Question
	Total Accepted: 48834 Total Submissions: 169169 Difficulty: Easy
	Given two strings s and t, determine if they are isomorphic.
	
	Two strings are isomorphic if the characters in s can be replaced to get t.
	
	All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
	
	For example,
	Given "egg", "add", return true.
	
	Given "foo", "bar", return false.
	
	Given "paper", "title", return true.
	
	Note:
	You may assume both s and t have the same length.
 */
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean isIsomorphic(String s, String t) {
        Map<String,String> map = new HashMap<String,String>();
        Map<String,String> map1 = new HashMap<String,String>();
        for(int i=0;i<s.length();i++)
        {
            if(map.get(t.charAt(i)+"")==null)
            {
            	if(map1.get(s.charAt(i)+"")==null)
            	{
            		map.put(t.charAt(i)+"",s.charAt(i)+"");
            		map1.put(s.charAt(i)+"",t.charAt(i)+"");
            	}else
            	{
            		if(!map1.get(s.charAt(i)+"").equals(t.charAt(i)+""))
                        return false;
            	}
            }else
            {
                if(!map.get(t.charAt(i)+"").equals(s.charAt(i)+""))
                    return false;
            }
        }
        return true;
    }
}
