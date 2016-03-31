package com.tangbo.exercise.searchinsertposition;
/*
 * 35. Search Insert Position My Submissions QuestionEditorial Solution
	Total Accepted: 100027 Total Submissions: 269598 Difficulty: Medium
	Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
	
	You may assume no duplicates in the array.
	
	Here are few examples.
	[1,3,5,6], 5 → 2
	[1,3,5,6], 2 → 1
	[1,3,5,6], 7 → 4
	[1,3,5,6], 0 → 0
	
	Subscribe to see which companies asked this question
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0] || nums.length==0)
            return 0;
        if(target>nums[nums.length-1])
            return nums.length;
        if(nums.length==1)
            return nums[0]<=target?0:1;
        return findTarVal(nums,target,0,nums.length);
    }
    public int findTarVal(int [] nums,int target,int star,int end)
    {
        if(end-star==1)
        {
            if(nums[star]==target)
                return star;
            return end;
        }
        int n = (star+end)/2;
        if(target>nums[n])
            return findTarVal(nums,target,n,end);
        else if(target==nums[n])
            return n;
        else
            return findTarVal(nums,target,star,n);
    }
}
