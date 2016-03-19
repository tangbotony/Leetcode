package com.tangbo.exercise.summaryranges;

import java.util.ArrayList;
import java.util.List;

/*
 * 228. Summary Ranges My Submissions Question
	Total Accepted: 41346 Total Submissions: 174969 Difficulty: Easy
	Given a sorted integer array without duplicates, return the summary of its ranges.
	
	For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
	
	Credits:
	Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
	

 */
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        if(nums.length==0)
            return result;
        String temp = nums[0]+"";
        int befor = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=befor+1)
            {
                if(Integer.parseInt(temp)!=nums[i-1])
                    temp = temp + "->" + befor;
                result.add(temp);
                temp = nums[i]+"";
            }
            befor = nums[i];
        }
        if(Integer.parseInt(temp)!=nums[nums.length-1])
            temp = temp + "->" + nums[nums.length-1];
        result.add(temp);
        return result;
    }
}