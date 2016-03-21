package com.tangbo.exercise.reverseinteger;
/*
 * 7. Reverse Integer My Submissions Question
	Total Accepted: 129185 Total Submissions: 547318 Difficulty: Easy
	Reverse digits of an integer.
	
	Example1: x = 123, return 321
	Example2: x = -123, return -321
	
	click to show spoilers.
	
	Have you thought about this?
	Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
	
	If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
	
	Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?
	
	For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
	
	Update (2014-11-10):
	Test cases had been added to test the overflow behavior.
	
	Subscribe to see which companies asked this question
	
	Show Tags
	Show Similar Problems

 */
public class Solution {
	public int reverse(int x) {
		 int result = 0;
		 boolean isNeg = x > 0 ? false : true;
		 x = Math.abs(x);
		 int i = (x+"").length()-1;
		 while(x!=0)
		 {

			 if(x % 10>2 && i>=9)
				 return 0;
			 int temp = (int)Math.pow(10, i)*(x % 10);
			 if(isNeg)
			 {
				 if((-1*result)!=0 && (-1*result)-Integer.MIN_VALUE<temp)
					 return 0;
			 }else
			 {
				 if(Integer.MAX_VALUE-result<temp)
					 return 0;
			 }
			 result += temp;
			 x = x / 10;
			 i--;
		 }
		 return isNeg?(-1)*result:result;
	 }
}






