package com.tangbo.exercise.majorityelement;
/*
 * 169. Majority Element My Submissions Question
	Total Accepted: 97031 Total Submissions: 241394 Difficulty: Easy
	Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
	
	You may assume that the array is non-empty and the majority element always exist in the array.
 */
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int majorityElement(int[] nums) {
		if(nums.length<3)
			return nums[0];
		int major = (int)Math.floor(nums.length/2.0);
		Map<Integer, Integer> count = new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			if(count.get(nums[i])==null)
				count.put(nums[i], 1);
			else
			{
				if(count.get(nums[i])+1>major)
					return nums[i];
				else
					count.put(nums[i], count.get(nums[i])+1);
			}
		}
        return 0;
    }
}
