package com.tangbo.exercise.linkedlistcycle;
/*
 * 141. Linked List Cycle My Submissions QuestionEditorial Solution
	Total Accepted: 98785 Total Submissions: 267681 Difficulty: Medium
	Given a linked list, determine if it has a cycle in it.
	
	Follow up:
	Can you solve it without using extra space?
	
	Subscribe to see which companies asked this question
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
            return false;
        ListNode slow = head.next;//slow、fast
        ListNode fast = head.next;
        while(fast != null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                return true;
        }
        return false;
    }
}
