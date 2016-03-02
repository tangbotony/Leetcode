package com.tangbo.exercise.sametree;
/*
	100. Same Tree My Submissions Question
	Total Accepted: 113724 Total Submissions: 265378 Difficulty: Easy
	Given two binary trees, write a function to check if they are equal or not.
	
	Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
	
	Subscribe to see which companies asked this question
 */
public class Solution {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		boolean flag = true;
		if(p!=null && q!= null && p.val == q.val)
			flag = isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		else if(p == null && q == null)
			flag = true;
		else
			flag = false;
        return flag;
    }
}
