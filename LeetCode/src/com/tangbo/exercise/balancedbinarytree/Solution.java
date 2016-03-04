package com.tangbo.exercise.balancedbinarytree;
/*
 * 110. Balanced Binary Tree My Submissions Question
	Total Accepted: 99827 Total Submissions: 297296 Difficulty: Easy
	Given a binary tree, determine if it is height-balanced.
	
	For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
	
	Subscribe to see which companies asked this question
 */
public class Solution {
	public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        if(Math.abs(getTreeDepth(root.left)-getTreeDepth(root.right))>1)
        	return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int getTreeDepth(TreeNode root)
    {
    	if(root == null)
    		return 0;
    	return Math.max(getTreeDepth(root.left),getTreeDepth(root.right))+1;
    }
}
