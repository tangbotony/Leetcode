package com.tangbo.exercise.twosum;

import java.util.HashMap;

/*
 * 1. Two Sum My Submissions Question
	Total Accepted: 203487 Total Submissions: 922821 Difficulty: Easy
	Given an array of integers, return indices of the two numbers such that they add up to a specific target.

	You may assume that each input would have exactly one solution.

	Example:
	Given nums = [2, 7, 11, 15], target = 9,

	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
	UPDATE (2016/2/13):
	The return format had been changed to zero-based indices. Please read the above updated description carefully.

	Subscribe to see which companies asked this question
 */
public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				result[0] = index;
				result[1] = i;
				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}
		return result;
	}
}
