package com.tangbo.exercise.containsduplicateII;

import java.util.HashMap;
import java.util.Map;

/*
 * 219. Contains Duplicate II My Submissions Question
	Total Accepted: 48492 Total Submissions: 165203 Difficulty: Easy
	Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
	
	Subscribe to see which companies asked this question
	
	Show Tags
	Show Similar Problems
 */
public class Solution {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag = false;
        Map<Integer,Integer> count = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(count.get(nums[i])!=null && i-count.get(nums[i])<=k)
            {
                flag = true;
                break;
            }else
                count.put(nums[i],i);
        }
        return flag;
    }
}
