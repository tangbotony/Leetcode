package com.tangbo.exercise.removelinkedlistelements;
/*
 * 203. Remove Linked List Elements My Submissions Question
	Total Accepted: 55047 Total Submissions: 196006 Difficulty: Easy
	Remove all elements from a linked list of integers that have value val.
	
	Example
	Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
	Return: 1 --> 2 --> 3 --> 4 --> 5
	
	Credits:
	Special thanks to @mithmatt for adding this problem and creating all test cases.
	
	Subscribe to see which companies asked this question
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
        while(head !=null && head.val==val)
            head = head.next;
        ListNode beforNode = null;
        ListNode currentNode = head;
        while(currentNode!=null)
        {
            if(currentNode.val == val)
            {
                beforNode.next = currentNode.next;
                currentNode = beforNode.next;
            }else
            {
                beforNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}