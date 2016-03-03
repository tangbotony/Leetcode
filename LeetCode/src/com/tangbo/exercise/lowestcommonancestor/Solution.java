package com.tangbo.exercise.lowestcommonancestor;
import java.util.ArrayList;
/*
 * 235. Lowest Common Ancestor of a Binary Search Tree My Submissions Question
	Total Accepted: 56798 Total Submissions: 149440 Difficulty: Easy
	Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
	
	According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”
	
	        _______6______
	       /              \
	    ___2__          ___8__
	   /      \        /      \
	   0      _4       7       9
	         /  \
	         3   5
	For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
 */
public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
	{
		TreeNode result = root;
		ArrayList<TreeNode> pPath = new ArrayList<TreeNode>();
		ArrayList<TreeNode> qPath = new ArrayList<TreeNode>();
		if(getPathFromRoot2Node(root, p, pPath) && getPathFromRoot2Node(root , q , qPath))
		{
			for(int i=0;i<(pPath.size()>qPath.size()?qPath.size():pPath.size());i++)
				if(pPath.get(i).val==qPath.get(i).val)
					result = pPath.get(i);
				else
					break;
		}
        return result;
    }
	public boolean getPathFromRoot2Node(TreeNode root, TreeNode node, ArrayList<TreeNode> pathArray) {
        if(root==null||node==null) 
            return false;
        pathArray.add(root);
        if(root.val==node.val) 
            return true;
        if(root.left!=null)
            if(getPathFromRoot2Node(root.left,node,pathArray)==true) {
                return true;
            }
        if(root.right!=null) 
            if(getPathFromRoot2Node(root.right,node,pathArray)==true) {
                return true;
            }
        //回溯
        pathArray.remove(pathArray.size() - 1);
        return false;
    }
}
