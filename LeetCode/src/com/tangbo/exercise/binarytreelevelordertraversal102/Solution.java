package com.tangbo.exercise.binarytreelevelordertraversal102;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 102. Binary Tree Level Order Traversal My Submissions Question
	Total Accepted: 92871 Total Submissions: 289877 Difficulty: Easy
	Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
	
	For example:
	Given binary tree {3,9,20,#,#,15,7},
	    3
	   / \
	  9  20
	    /  \
	   15   7
	return its level order traversal as:
	[
	  [3],
	  [9,20],
	  [15,7]
	]
	confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<List<Integer>>();
        Map<Integer,ArrayList<Integer>> tempMap = new HashMap<Integer,ArrayList<Integer>>();
	    List<List<Integer>> result = new ArrayList<List<Integer>>();
        int height = 0;
        myLevelOrder(root,height,tempMap);
        height = tempMap.size();
        for(int i=0;i<height;i++)
        {
            result.add(tempMap.get(i));
        }
        return result;
    }
    public void myLevelOrder(TreeNode root,int height,Map<Integer,ArrayList<Integer>> tempMap)
    {
        if(root == null)
            return;
        ArrayList<Integer> temp;
        if(tempMap.get(height)==null)
        {
            temp = new  ArrayList<Integer>();
            temp.add(root.val);
            tempMap.put(height,temp);
        }else
        {
            tempMap.get(height).add(root.val);
        }
        myLevelOrder(root.left,height+1,tempMap);
        myLevelOrder(root.right,height+1,tempMap);
    }
}