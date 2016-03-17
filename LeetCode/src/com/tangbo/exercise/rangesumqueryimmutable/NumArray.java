package com.tangbo.exercise.rangesumqueryimmutable;
/*
 * 303. Range Sum Query - Immutable My Submissions Question
	Total Accepted: 22923 Total Submissions: 93682 Difficulty: Easy
	Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
	
	Example:
	Given nums = [-2, 0, 3, -5, 2, -1]
	
	sumRange(0, 2) -> 1
	sumRange(2, 5) -> -1
	sumRange(0, 5) -> -3
	Note:
	You may assume that the array does not change.
	There are many calls to sumRange function.
	Subscribe to see which companies asked this question
	
	Show Tags
	Show Similar Problems

 */
public class NumArray {

    int[] sums;  
      
    public NumArray(int[] nums) {  
        sums = new int[nums.length];  
        System.arraycopy(nums, 0, sums, 0, nums.length);  
        for(int i=1; i<sums.length; i++) {  
            sums[i] += sums[i-1];   
        }  
    }  
  
    public int sumRange(int i, int j) {  
        if(i>j || i<0 || j<0 || j>=sums.length) return 0;  
        return i==0 ? sums[j] : (sums[j] - sums[i-1]);  
    }  
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);