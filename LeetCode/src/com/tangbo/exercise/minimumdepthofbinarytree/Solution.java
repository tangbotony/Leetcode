package com.tangbo.exercise.minimumdepthofbinarytree;
/*
 * 111. Minimum Depth of Binary Tree My Submissions Question
	Total Accepted: 96523 Total Submissions: 318430 Difficulty: Easy
	Given a binary tree, find its minimum depth.
	
	The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
	
	Subscribe to see which companies asked this question
	
	Show Tags
	Show Similar Problems

 */
public class Solution {
	private int min = -1;
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        getMinDepth(root,1);
        return min;
    }
    public void getMinDepth(TreeNode root,int depth)
    {
        if(root.left == null && root.right == null)
        {
            if(min == -1)
                min = depth;
            else if(depth<min)
                min = depth;
            return;
        }
        if(root.left != null)
            getMinDepth(root.left,depth+1);
        if(root.right != null)
            getMinDepth(root.right,depth+1);
    }
}
