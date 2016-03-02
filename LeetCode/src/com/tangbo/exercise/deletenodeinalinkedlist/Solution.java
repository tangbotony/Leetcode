package com.tangbo.exercise.deletenodeinalinkedlist;
/*
 *  237. Delete Node in a Linked List My Submissions Question
	Total Accepted: 65837 Total Submissions: 150550 Difficulty: Easy
	Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
	Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
 */
public class Solution {
	public void deleteNode(ListNode node) {
        if(node.next==null)
        	node = null;
        else
        {
        	node.val = node.next.val;
        	node.next = node.next.next;
        }
    }
}
