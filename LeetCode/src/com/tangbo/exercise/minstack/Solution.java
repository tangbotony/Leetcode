package com.tangbo.exercise.minstack;
/*
 * 155. Min Stack My Submissions Question
	Total Accepted: 66072 Total Submissions: 303314 Difficulty: Easy
	Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
	
	push(x) -- Push element x onto stack.
	pop() -- Removes the element on top of the stack.
	top() -- Get the top element.
	getMin() -- Retrieve the minimum element in the stack.
	Subscribe to see which companies asked this question
	
	Show Tags
	Show Similar Problems

 */
import java.util.ArrayList;

class MinStack {
    int min = Integer.MAX_VALUE;
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> minList = new ArrayList<Integer>();
    public void push(int x) {
        if(x<min)
            min = x;
        list.add(x);
        minList.add(min);
    }

    public void pop() {
        if(list.size()>0)
        {
            list.remove(list.size()-1);
            minList.remove(minList.size()-1);
            if(minList.size()==0)
                min = Integer.MAX_VALUE;
            else
                min = minList.get(minList.size()-1);
        }
    }

    public int top() {
        return list.get(list.size()-1);
    }

    public int getMin() {
        return minList.get(minList.size()-1);
    }
}

