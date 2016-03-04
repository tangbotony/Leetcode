package com.tangbo.exercise.mergetwosortedlists;
/*
 * 21. Merge Two Sorted Lists My Submissions Question
	Total Accepted: 112519 Total Submissions: 323042 Difficulty: Easy
	Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if(l1 == null || l2 ==null)
    	{
    		if(l1==null)
    			return l2;
    		else 
    			return l1;
    	}
    	if(l1.val>l2.val)
    		return mergeTwoLists(l2, l1);
    	ListNode tempNode = l1;
    	ListNode l1TempleNode,l2TempleNode,indexNode;
    	l1TempleNode = l1.next;
    	l2TempleNode = l2;
    	while(l1TempleNode != null && l2TempleNode != null)
    	{
    		if(l1TempleNode.val < l2TempleNode.val)
    		{
    			indexNode = l1TempleNode;
    			l1TempleNode = l1TempleNode.next;
    		}else
    		{
    			indexNode = l2TempleNode;
    			l2TempleNode = l2TempleNode.next;
    		}
    		tempNode.next = indexNode;
    		tempNode = tempNode.next;
    	}
    	tempNode.next = l2TempleNode==null ? l1TempleNode : l2TempleNode;
        return l1;
    }
}






