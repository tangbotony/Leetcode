package com.tangbo.exercise.validanagram;

import java.util.HashMap;
import java.util.Map;

/*
	242. Valid Anagram My Submissions Question
	Total Accepted: 63841 Total Submissions: 155712 Difficulty: Easy
	Given two strings s and t, write a function to determine if t is an anagram of s.
	
	For example,
	s = "anagram", t = "nagaram", return true.
	s = "rat", t = "car", return false.
	
	Note:
	You may assume the string contains only lowercase alphabets.
	
	Follow up:
	What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class Solution {
	public boolean isAnagram(String s, String t) {
		boolean flag=true;
		int count[] = new int[26];
		byte sbyte[] = s.getBytes();
		byte tbyte[] = t.getBytes();
		for(int i=0;i<sbyte.length;i++)
			count[sbyte[i]-97]++;
		for(int i=0;i<tbyte.length;i++)
			count[tbyte[i]-97]--;
		for(int i=0;i<count.length;i++)
			if(count[i]!=0)
				flag=false;
		return flag;
	}
}
