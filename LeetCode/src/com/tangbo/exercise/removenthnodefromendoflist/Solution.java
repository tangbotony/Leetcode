package com.tangbo.exercise.removenthnodefromendoflist;

import java.util.HashMap;
import java.util.Map;

/*
 * 19. Remove Nth Node From End of List My Submissions Question
	Total Accepted: 97947 Total Submissions: 339002 Difficulty: Easy
	Given a linked list, remove the nth node from the end of list and return its head.
	
	For example,
	
	   Given linked list: 1->2->3->4->5, and n = 2.
	
	   After removing the second node from the end, the linked list becomes 1->2->3->5.
	Note:
	Given n will always be valid.
	Try to do this in one pass.
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Map<Integer,ListNode> map = new HashMap<Integer,ListNode>();
        ListNode temp = head;
        int i=1;
        while(temp!=null)
        {
            map.put(i,temp);
            temp = temp.next;
            i++;
        }
        if(n==(i-1))
        {
            head = head.next;
        }else
        {
            temp = map.get(i-1-n);
            temp.next = temp.next.next;
        }
        return head;
    }
}