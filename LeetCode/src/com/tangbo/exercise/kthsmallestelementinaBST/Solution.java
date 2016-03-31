package com.tangbo.exercise.kthsmallestelementinaBST;

import java.util.ArrayList;
import java.util.List;

/*
 * 230. Kth Smallest Element in a BST My Submissions QuestionEditorial Solution
	Total Accepted: 41838 Total Submissions: 112770 Difficulty: Medium
	Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
	
	Note: 
	You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
	
	Follow up:
	What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?
	
	Show Hint 

 */
public class Solution {
    private List<Integer> sortedArray = new ArrayList<Integer>();
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)
            return 0;
        sortSearch(root);
        return sortedArray.get(k-1);
    }
    
    public void sortSearch(TreeNode root)
    {
        if(root.left != null)
            sortSearch(root.left);
        sortedArray.add(root.val);
        if(root.right != null)
            sortSearch(root.right);
    }
}