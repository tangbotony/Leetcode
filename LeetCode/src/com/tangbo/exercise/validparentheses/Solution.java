package com.tangbo.exercise.validparentheses;

import java.util.HashMap;
import java.util.Stack;

/*
 * 20. Valid Parentheses My Submissions Question
	Total Accepted: 97322 Total Submissions: 337416 Difficulty: Easy
	Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	
	The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
	
	Subscribe to see which companies asked this question
	
	Show Tags
	Show Similar Problems

 */
public class Solution {
	public boolean isValid(String s) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
	 
		Stack<Character> stack = new Stack<Character>();
	 
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
	 
			if (map.keySet().contains(curr)) {
				stack.push(curr);
			} else if (map.values().contains(curr)) {
				if (!stack.empty() && map.get(stack.peek()) == curr) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
	 
		return stack.empty();
	}
}
