package com.tangbo.exercise.binarytreelevelordertraversal;
import java.util.ArrayList;
import java.util.HashMap;
/*
 * 107. Binary Tree Level Order Traversal II My Submissions Question
	Total Accepted: 72450 Total Submissions: 217604 Difficulty: Easy
	Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
	
	For example:
	Given binary tree {3,9,20,#,#,15,7},
	    3
	   / \
	  9  20
	    /  \
	   15   7
	return its bottom-up level order traversal as:
	[
	  [15,7],
	  [9,20],
	  [3]
	]
	confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
	
	Subscribe to see which companies asked this question
 */
import java.util.List;
import java.util.Map;
public class Solution {
	Map<Integer, List<Integer>> map= new HashMap<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	int leveal =0;
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	myLevelOrderBottom(root,leveal,map);
    	for(int i = leveal;i>=0;i--)
    	{
    		result.add(map.get(i));
    	}
    	return result;
    }

	private void myLevelOrderBottom(TreeNode root,int leveal,Map<Integer, List<Integer>> map) {
		if(root == null)
			return;
		List<Integer> temp = null;
		if(map.get(leveal)!=null)
		{
			temp = map.get(leveal);
			temp.add(root.val);
		}else
		{
			temp = new ArrayList<Integer>();
			temp.add(root.val);
		}
		myLevelOrderBottom(root.left,leveal+1,map);
		myLevelOrderBottom(root.right, leveal+1, map);
	}
}














