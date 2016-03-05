package com.tangbo.exercise.symmetrictree;
/*
 * 101. Symmetric Tree My Submissions Question
	Total Accepted: 97126 Total Submissions: 290443 Difficulty: Easy
	Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
	
	For example, this binary tree is symmetric:
	
	    1
	   / \
	  2   2
	 / \ / \
	3  4 4  3
	But the following is not:
	    1
	   / \
	  2   2
	   \   \
	   3    3
	Note:
	Bonus points if you could solve it both recursively and iteratively.
	
	confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
    	if(root == null)
    		return true;
        return check(root.left, root.right);
    }
    public boolean check(TreeNode left,TreeNode right)
    {
    	boolean flag = false;
    	if(left == null && right == null)
    		flag = true;
    	if(left !=null && right != null && left.val == right.val)
    		flag = true && check(left.left, right.right) && check(left.right, right.left);
    	return flag;
    }
}