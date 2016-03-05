package com.tangbo.exercise.implementstackusingqueues;

import java.util.LinkedList;
import java.util.Queue;
/*
 * 225. Implement Stack using Queues My Submissions Question
	Total Accepted: 32892 Total Submissions: 108019 Difficulty: Easy
	Implement the following operations of a stack using queues.
	
	push(x) -- Push element x onto stack.
	pop() -- Removes the element on top of the stack.
	top() -- Get the top element.
	empty() -- Return whether the stack is empty.
	Notes:
	You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
	Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
	You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
	Update (2015-06-11):
	The class name of the Java function had been updated to MyStack instead of Stack.
 */
class MyStack {
    // Push element x onto stack.  
    Queue<Integer> q1 = new LinkedList<Integer>();  
    Queue<Integer> q2 = new LinkedList<Integer>();  
      
    public void push(int x) {  
        q1.offer(x);  
    }  
  
    // Removes the element on top of the stack.  
    public void pop() {  
        while(q1.size()>1) q2.offer(q1.poll());  
        q1.poll();  
        Queue<Integer> q = q1;  
        q1 = q2;  
        q2 = q;  
    }  
  
    // Get the top element.  
    public int top() {  
        while(q1.size()>1) q2.offer(q1.poll());  
        int x = q1.poll();  
        q2.offer(x);  
        Queue<Integer> q = q1;  
        q1 = q2;  
        q2 = q;  
        return x;  
    }  
  
    // Return whether the stack is empty.  
    public boolean empty() {  
        return q1.isEmpty();  
    }}
