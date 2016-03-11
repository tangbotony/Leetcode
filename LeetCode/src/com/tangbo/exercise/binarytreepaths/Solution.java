package com.tangbo.exercise.binarytreepaths;
/*
 * 257. Binary Tree Paths My Submissions Question
	Total Accepted: 38433 Total Submissions: 139717 Difficulty: Easy
	Given a binary tree, return all root-to-leaf paths.
	
	For example, given the following binary tree:
	
	   1
	 /   \
	2     3
	 \
	  5
	All root-to-leaf paths are:
	
	["1->2->5", "1->3"]
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        String temp = "";
        if(root != null)
            getPath(root,temp,result);
        return result;
    }
    public void getPath(TreeNode root,String temp,List<String> list)
    {
        temp = temp + (temp.length()==0?"":"->") + root.val;
        if(root.left==null && root.right==null)
            list.add(temp);
        else{
            if(root.left!=null)
                getPath(root.left,temp,list);
            if(root.right!=null)
                getPath(root.right,temp,list);
        }
    }
}
