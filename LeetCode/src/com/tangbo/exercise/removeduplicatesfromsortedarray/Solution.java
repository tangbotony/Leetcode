package com.tangbo.exercise.removeduplicatesfromsortedarray;
/*
 * 26. Remove Duplicates from Sorted Array My Submissions Question
	Total Accepted: 116486 Total Submissions: 353318 Difficulty: Easy
	Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
	
	Do not allocate extra space for another array, you must do this in place with constant memory.
	
	For example,
	Given input array nums = [1,1,2],
	
	Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
	
	Subscribe to see which companies asked this question
 */
public class Solution {
	public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        int index = -1;
        int currentValue = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] != currentValue)
            {
                if(index == -1)
                {
                    currentValue = nums[i];
                }else
                {
                    nums[index] =  nums[i];
                    currentValue = nums[index];
                    index++;
                }
            }else
            {
                if(index == -1)
                    index = i;
            }
        }
        return index==-1?nums.length:index;
    }
}
