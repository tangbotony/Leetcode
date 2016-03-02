package com.tangbo.exercise.invertbinarytree;
/*
 *  Total Accepted: 73016 Total Submissions: 165661 Difficulty: Easy
	Invert a binary tree.
	
	     4
	   /   \
	  2     7
	 / \   / \
	1   3 6   9
	to
	     4
	   /   \
	  7     2
	 / \   / \
	9   6 3   1
	Trivia:
	This problem was inspired by this original tweet by Max Howell:
	Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so fuck off.
	Subscribe to see which companies asked this question
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
    	if(root==null)
    		return null;
    	TreeNode temp = root.left;
    	root.left = invertTree(root.right);
    	root.right = invertTree(temp);
        return root;
    }
}