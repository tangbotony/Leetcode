package com.tangbo.exercise.productofarrayexceptself;
/*
 * 238. Product of Array Except Self My Submissions Question
	Total Accepted: 39308 Total Submissions: 93349 Difficulty: Medium
	Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
	
	Solve it without division and in O(n).
	
	For example, given [1,2,3,4], return [24,12,8,6].
	
	Follow up:
	Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
	
	Subscribe to see which companies asked this question
	
	Show Tags
	Show Similar Problems

 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int product=1;
        int count=0;
        for(int temp : nums)
        {
            if(temp != 0)
                product *= temp;
            else
                count ++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                if(count == 1) result[i]=product;
                else result[i] =0;
            }else
            {
                if(count>0) result[i]=0;
                else result[i] = product/nums[i];
            }
        }
        return result;
    }
}