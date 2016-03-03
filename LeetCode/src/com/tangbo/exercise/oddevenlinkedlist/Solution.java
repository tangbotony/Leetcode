package com.tangbo.exercise.oddevenlinkedlist;
/*
 * 328. Odd Even Linked List My Submissions Question
	Total Accepted: 18824 Total Submissions: 50134 Difficulty: Easy
	Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
	
	You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
	
	Example:
	Given 1->2->3->4->5->NULL,
	return 1->3->5->2->4->NULL.
	
	Note:
	The relative order inside both the even and odd groups should remain as it was in the input. 
	The first node is considered odd, the second node even and so on ...
 */
public class Solution {
	public ListNode oddEvenList(ListNode head) {
		if(head == null || head.next == null || head.next.next==null)//排除只有两个节点的情况
			return head;
		ListNode secodeNode = head.next;
		ListNode temp = head.next;
		ListNode currentNode = head.next.next;
		if(currentNode != null)
			head.next = currentNode;
		while(true){
			if(currentNode.next==null)
				break;
			temp.next = currentNode.next;
			temp = temp.next;
			if(currentNode.next.next==null)
			    break;
			currentNode.next = currentNode.next.next;
			currentNode = currentNode.next;
		}
		temp.next = null;//防止循环，偶数位子的节点在指向奇数位子的节点
		currentNode.next = secodeNode;
		return head;
    }
}
