package com.tangbo.exercise.removeelement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 27. Remove Element My Submissions Question
	Total Accepted: 104749 Total Submissions: 316777 Difficulty: Easy
	Given an array and a value, remove all instances of that value in place and return the new length.
	
	The order of elements can be changed. It doesn't matter what you leave beyond the new length.
	
	Subscribe to see which companies asked this question
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
    	if(nums == null || nums.length == 0)
            return 0;
        int index = nums.length-1;
        while(index>0 && nums[index]==val)
            index--;
        if(index < 0)
            return 0;
        int i;
        for(i = 0; i < nums.length; i++)
        {
            if(i == index)
                return nums[i]==val ? i : i+1;
            else
            {
                if(nums[i]==val)
                {
                    nums[i] = nums[index];
                    nums[index] = val;
                    while(nums[index]==val)
                    {
                        index--;
                    }if(index==i)
                    {
                        return i++;
                    }
                }
            }
        }
        return i;
        
    }
    public static void main(String[] args) {
		int nums[] = {4,5};
		System.out.println(new Solution().removeElement(nums, 4));
	}
}
