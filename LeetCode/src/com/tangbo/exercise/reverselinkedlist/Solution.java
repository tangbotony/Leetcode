package com.tangbo.exercise.reverselinkedlist;
/*
	206. Reverse Linked List My Submissions Question
	Total Accepted: 88536 Total Submissions: 230461 Difficulty: Easy
	Reverse a singly linked list.
	
	click to show more hints.
	
	Hint:
	A linked list can be reversed either iteratively or recursively. Could you implement both?
	
	Subscribe to see which companies asked this question
 */
import java.util.Stack;
public class Solution {
	Stack<ListNode> stack = new Stack<>();
	public ListNode reverseList(ListNode head) {
		if(head.next==null || head == null)
			return head;
		while(head.next!=null)
		{
			stack.push(head);
			head = head.next;
		}
		ListNode reverseHead = new ListNode(head.val);
		head = stack.pop();
		reverseHead.next = head;
		while(!stack.isEmpty())
		{
			head.next = stack.pop();
			head = head.next;
		}
		head.next = null;
        return reverseHead;
    }
}
