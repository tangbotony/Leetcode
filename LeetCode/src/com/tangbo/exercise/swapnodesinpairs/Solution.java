package com.tangbo.exercise.swapnodesinpairs;
/*
 * 24. Swap Nodes in Pairs My Submissions Question
	Total Accepted: 87100 Total Submissions: 249670 Difficulty: Easy
	Given a linked list, swap every two adjacent nodes and return its head.
	
	For example,
	Given 1->2->3->4, you should return the list as 2->1->4->3.
	
	Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
	
	Subscribe to see which companies asked this question
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next == null)
            return head;
        //对头结点单独处理
        ListNode tempNode = head;
        head = head.next;
        tempNode.next = head.next;
        head.next = tempNode;
        //头结点交换结束，准备后面的交换
        ListNode beforNode =head.next;
        tempNode = beforNode.next;
        ListNode nextNode;
        while(tempNode!=null)
        {
            if(tempNode.next==null)
                break;
            nextNode = tempNode.next;
            beforNode.next = nextNode;
            tempNode.next = nextNode.next;
            nextNode.next = tempNode;
            beforNode = tempNode;
            tempNode = tempNode.next;
        }
        return head;
    }
}
