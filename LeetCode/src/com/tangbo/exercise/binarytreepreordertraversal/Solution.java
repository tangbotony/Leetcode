package com.tangbo.exercise.binarytreepreordertraversal;
/*
 * 144. Binary Tree Preorder Traversal My Submissions Question
	Total Accepted: 114255 Total Submissions: 289771 Difficulty: Medium
	Given a binary tree, return the preorder traversal of its nodes' values.
	
	For example:
	Given binary tree {1,#,2,3},
	   1
	    \
	     2
	    /
	   3
	return [1,2,3].
	
	Note: Recursive solution is trivial, could you do it iteratively?
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        preorder(root,result);
        return result;
    }
    public void preorder(TreeNode root,List<Integer> result)
    {
        if(root==null)
            return;
        result.add(root.val);
        preorder(root.left,result);
        preorder(root.right,result);
    }
}
