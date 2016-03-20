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
	        int ret = 0;
	        int digit = 0;
	        boolean neg_flag = false;
	    
	        if (x < 0) {
	            neg_flag = true;
	            x = -1 * x;
	        }
	            
	        while (x != 0) {
	            digit = x % 10;
	            if (ret != 0) {
	                if ((Integer.MAX_VALUE - digit) / ret < 10 ) 
	                    return 0;
	                    
	                if (neg_flag == true) {
	                    if (-10 < (Integer.MIN_VALUE + digit) / ret)
	                   return 0;
	                } 
	            }
	            ret = ret * 10 + digit;
	            x = x / 10;
	        }
	        if (neg_flag == true && ret > 0)
	            ret = -1 * ret; 
	        return ret;
	    }
}






