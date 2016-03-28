package com.tangbo.exercise.binarytreeinordertraversal;

import java.util.ArrayList;
import java.util.List;


/*
 * 94. Binary Tree Inorder Traversal My Submissions QuestionEditorial Solution
	Total Accepted: 117156 Total Submissions: 298449 Difficulty: Medium
	Given a binary tree, return the inorder traversal of its nodes' values.
	
	For example:
	Given binary tree {1,#,2,3},
	   1
	    \
	     2
	    /
	   3
	return [1,3,2].
	
	Note: Recursive solution is trivial, could you do it iteratively?
	
	confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
	
	Subscribe to see which companies asked this question
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        inorder(root,result);
        return result;
    }
    public void inorder(TreeNode root,List<Integer> result)
    {
        if(root==null)
            return;
        inorder(root.left,result);
        result.add(root.val);
        inorder(root.right,result);
    }
}
