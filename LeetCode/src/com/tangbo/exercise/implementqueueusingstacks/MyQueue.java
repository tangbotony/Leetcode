package com.tangbo.exercise.implementqueueusingstacks;
/*
 * 232. Implement Queue using Stacks My Submissions Question
	Total Accepted: 35606 Total Submissions: 104896 Difficulty: Easy
	Implement the following operations of a queue using stacks.
	
	push(x) -- Push element x to the back of queue.
	pop() -- Removes the element from in front of queue.
	peek() -- Get the front element.
	empty() -- Return whether the queue is empty.
	Notes:
	You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
	Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
	You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
 */
import java.util.Stack;
class MyQueue {
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> tempStack = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
    	if(!tempStack.isEmpty())
    		tempStack.pop();
    	else
    	{
    		while(!stack.isEmpty())
    			tempStack.push(stack.pop());
    		tempStack.pop();
    	}
    }

    // Get the front element.
    public int peek() {
    	if(!tempStack.isEmpty())
    		return tempStack.peek();
    	else
    	{
    		while(!stack.isEmpty())
    			tempStack.push(stack.pop());
    		return tempStack.peek();
    	}
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return tempStack.empty() && stack.empty();
    }
    public static void main(String[] args) {
    	MyQueue myQueue = new MyQueue();
    	myQueue.push(1);
    	myQueue.pop();
    	System.out.println(myQueue.empty());
	}
}