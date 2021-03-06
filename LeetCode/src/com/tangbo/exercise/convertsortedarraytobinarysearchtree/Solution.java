package com.tangbo.exercise.convertsortedarraytobinarysearchtree;
/*
 * 108. Convert Sorted Array to Binary Search Tree My Submissions QuestionEditorial Solution
	Total Accepted: 72088 Total Submissions: 195253 Difficulty: Medium
	Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
	
	Subscribe to see which companies asked this question
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        return constructBST(nums,0,nums.length-1);
    }
    public TreeNode constructBST(int[] nums,int left,int right)
    {
        if(right<left)
            return null;
        TreeNode node = new TreeNode(nums[(left+right)/2]);
        node.left = constructBST(nums,left,(left+right)/2-1);
        node.right = constructBST(nums,(left+right)/2+1,right);
        return node;
    }
}
