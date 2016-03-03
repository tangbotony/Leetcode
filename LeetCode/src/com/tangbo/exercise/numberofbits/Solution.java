package com.tangbo.exercise.numberofbits;
/*
 * 191. Number of 1 Bits My Submissions Question
	Total Accepted: 77788 Total Submissions: 207021 Difficulty: Easy
	Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).	
	For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 */
public class Solution {
	 // you need to treat n as an unsigned value
    /*
     * 由于java没有无符号整形，所以采用C++来写，代码如下
     */
	/*
	class Solution {
		public:
		    int hammingWeight(uint32_t n) {
		        int result = 0;
		        uint32_t temp;
		        while(n>0)
		        {
		        	temp = n;
		        	n=n >> 1;
		        	if(temp==1 || temp==3 || temp % n == 1)
		        		result++;
		        }
		        return result;
		    }
		};
	*/
}
