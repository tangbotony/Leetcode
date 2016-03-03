package com.tangbo.exercise.climbingStairs;
import java.util.HashMap;
/*
 * 70. Climbing Stairs My Submissions Question
	Total Accepted: 96555 Total Submissions: 266375 Difficulty: Easy
	You are climbing a stair case. It takes n steps to reach to the top.
	
	Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
import java.util.Map;
public class Solution {
	Map<Integer, Integer> count = new HashMap<>();
    public int climbStairs(int n) {
    	if(count.get(n)!=null)
    		return count.get(n);
    	count.put(0, 0);
    	count.put(1, 1);
    	count.put(2,2);
    	for(int i=3;i<n+1;i++)
    	{
    		count.put(i,count.get(i-1)+count.get(i-2));
    	}
    	return count.get(n);
    }
    public static void main(String[] args) {
		System.out.println(new Solution().climbStairs(3));
	}
}