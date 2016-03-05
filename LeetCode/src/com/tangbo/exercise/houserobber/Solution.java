package com.tangbo.exercise.houserobber;
import java.util.HashMap;
/*
 * 198. House Robber My Submissions Question
	Total Accepted: 57319 Total Submissions: 171646 Difficulty: Easy
	You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
	
	Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
	
	Credits:
	Special thanks to @ifanchu for adding this problem and creating all test cases. Also thanks to @ts for adding additional test cases.
	
	Subscribe to see which companies asked this question
 */
import java.util.Map;
public class Solution {
	/*
	 * 典型的动态规划的题目
	 * 状态转移方程 rob[i] = max(rob[i-1],rob[i-2]);决定第i个位置是否抢劫
	 */
	Map<Integer, Integer> tempMap = new HashMap<Integer,Integer>();
    public int rob(int[] nums) {
    	if(nums.length == 0)
    		return 0;
        if(nums.length == 1)
        	return nums[0];
        if(nums.length == 2)
        	return Math.max(nums[0], nums[1]);
        tempMap.put(0, nums[0]);
        tempMap.put(1, Math.max(nums[0], nums[1]));
        for(int i=2;i<nums.length;i++)
        {
        	tempMap.put(i, Math.max(tempMap.get(i-1),tempMap.get(i-2)+nums[i]));
        }
        
        return tempMap.get(nums.length-1);
    }
}