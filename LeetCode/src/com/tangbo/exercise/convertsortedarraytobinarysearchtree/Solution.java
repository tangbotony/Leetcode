package com.tangbo.exercise.convertsortedarraytobinarysearchtree;
/*
 * 108. Convert Sorted Array to Binary Search Tree My Submissions QuestionEditorial Solution
	Total Accepted: 72088 Total Submissions: 195253 Difficulty: Medium
	Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
	
	Subscribe to see which companies asked this question
 */
public class Solution {
	public TreeNode sortedArrayToBST(int[] num) {
		if (num.length == 0)
			return null;
 
		return sortedArrayToBST(num, 0, num.length - 1);
	}
 
	public TreeNode sortedArrayToBST(int[] num, int start, int end) {
		if (start > end)
			return null;
 
		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(num[mid]);
		root.left = sortedArrayToBST(num, start, mid - 1);
		root.right = sortedArrayToBST(num, mid + 1, end);
 
		return root;
	}
}
