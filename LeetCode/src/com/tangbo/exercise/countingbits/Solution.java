package com.tangbo.exercise.countingbits;
/*
 * 338. Counting Bits My Submissions Question
	Total Accepted: 5905 Total Submissions: 10737 Difficulty: Medium
	Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
	
	Example:
	For num = 5 you should return [0,1,1,2,1,2].
	
	Follow up:
	
	It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
	Space complexity should be O(n).
	Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
	Hint:
	
	You should make use of what you have produced already.
	Divide the numbers in ranges like [2-3], [4-7], [8-15] and so on. And try to generate new range from previous.
	Or does the odd/even status of the number help you in calculating the number of 1s?
	Credits:
	Special thanks to @ syedee for adding this problem and creating all test cases.
	
	Subscribe to see which companies asked this question
 */
public class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
        int base = 0;
        result[0] = 0;
        if(num>0) result[1]=1;
        else return result;
        for(int i=2;i<=num;i++)
        {	
            int index = (int) (Math.log10(i)/Math.log10(2));
            if(index!=0 && Math.pow(2,index) == i)
            {
                base = i;
                result[i] = 1;
                continue;
            }
            result[i] = result[i-base]+result[base];
        }
        return result;
    }
}
