package com.tangbo.exercise.removeduplicates;
/*
 * 83. Remove Duplicates from Sorted List My Submissions Question
	Total Accepted: 104029 Total Submissions: 286800 Difficulty: Easy
	Given a sorted linked list, delete all duplicates such that each element appear only once.
	
	For example,
	Given 1->1->2, return 1->2.
	Given 1->1->2->3->3, return 1->2->3.
	
	Subscribe to see which companies asked this question
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null)
            return head;
        ListNode currentNode = head;
		ListNode indexNode = currentNode;
		while(indexNode!=null)
		{
			if(indexNode.val == currentNode.val)
			{
				indexNode = indexNode.next;
			}else
			{
				currentNode.next = indexNode;
				currentNode = currentNode.next;
			}
		}
		if(currentNode.next!=null && currentNode.next.val == currentNode.val)//防止最后两个是一样的情形，[......4,5,5]
		    currentNode.next = null;
        return head;
    }
}
