package com.tangbo.exercise.movezeroes;
/*
	283. Move Zeroes My Submissions Question
	Total Accepted: 60044 Total Submissions: 137906 Difficulty: Easy
	Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
	
	For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
	
	Note:
	You must do this in-place without making a copy of the array.
	Minimize the total number of operations.
 */
public class Solution {
	public void moveZeroes(int[] nums) {
		int index = -1;
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==0)
			{
				if(index==-1)
					index=i;
				count++;
			}else if(index!=-1){
				nums[index]=nums[i];
				index++;
			}
		}
		for(int i=0;i<count;i++)
		{
			nums[nums.length-i-1]=0;
		}
	}
}
