package com.tangbo.exercise.rotatearray;
/*
 * 189. Rotate Array My Submissions Question
	Total Accepted: 66075 Total Submissions: 317741 Difficulty: Easy
	Rotate an array of n elements to the right by k steps.
	
	For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
	
	Note:
	Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
	
	[show hint]
	
	Related problem: Reverse Words in a String II
	
	Credits:
	Special thanks to @Freezen for adding this problem and creating all test cases.
	
	Subscribe to see which companies asked this question
	
	Show Tags
	Show Similar Problems
 */
public class Solution {
    void reverse(int[] nums, int start, int end) {  
       while(start < end) {  
           int temp = nums[start];  
           nums[start] = nums[end];  
           nums[end] = temp;  
           ++start;  
           --end;  
       }  
   }  
   public void rotate(int[] nums, int k) {  
       k = k % nums.length;  
       reverse(nums, 0, nums.length - 1 );  
       reverse(nums, 0, k - 1 );  
       reverse(nums, k, nums.length - 1 );  
   }  
}