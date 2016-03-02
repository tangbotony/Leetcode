package com.tangbo.exercise.containsduplicate;

import java.util.HashMap;
import java.util.Map;

/*
 * 217. Contains Duplicate My Submissions Question
	Total Accepted: 73088 Total Submissions: 180562 Difficulty: Easy
	Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.	
	Subscribe to see which companies asked this question
 */
public class Solution {
	public boolean containsDuplicate(int[] nums) {
		Map<String, Integer> count = new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			if(count.get(nums[i]+"")==null)
				count.put(nums[i]+"", 1);
			else
			{
				return true;
			}
		}
		return true;
    }
}
