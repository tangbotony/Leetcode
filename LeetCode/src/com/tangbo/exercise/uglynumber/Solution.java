package com.tangbo.exercise.uglynumber;
/*
 * 263. Ugly Number My Submissions Question
	Total Accepted: 44789 Total Submissions: 124710 Difficulty: Easy
	Write a program to check whether a given number is an ugly number.
	
	Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
	
	Note that 1 is typically treated as an ugly number.
 */
public class Solution {
	 public boolean isUgly(int num) {
		 if(num <= 0)
			 return false;
		 if(num == 1)
			 return true;
		return (num%2==0?isUgly(num/2):false) || (num%3==0?isUgly(num/3):false) || (num%5==0?isUgly(num/5):false);
	}
	 public static void main(String[] args) {
		System.out.println(new Solution().isUgly(0));
	}
}
