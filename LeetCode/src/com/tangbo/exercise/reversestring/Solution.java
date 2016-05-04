package com.tangbo.exercise.reversestring;
/*
 * 344. Reverse String   My Submissions QuestionEditorial Solution
Total Accepted: 14087 Total Submissions: 24202 Difficulty: Easy
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
 */
public class Solution {
	public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
