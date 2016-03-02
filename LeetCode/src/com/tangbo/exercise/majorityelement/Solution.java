package com.tangbo.exercise.majorityelement;

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
