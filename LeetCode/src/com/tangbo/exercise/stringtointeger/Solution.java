package com.tangbo.exercise.stringtointeger;
/*
 * 8. String to Integer (atoi) My Submissions Question
	Total Accepted: 93674 Total Submissions: 698169 Difficulty: Easy
	Implement atoi to convert a string to an integer.
	
	Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
	
	Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
	
	Update (2015-02-10):
	The signature of the C++ function had been updated. If you still see your function signature accepts a const char * argument, please click the reload button  to reset your code definition.
 */
public class Solution {
    public int myAtoi(String str) {
    	int result;
        String formal = "";
        boolean flag = false;
        for(int i =0; i<str.length(); i++)
        {
            if(str.charAt(i)>='0' && str.charAt(i)<='9' || (str.charAt(i)=='-' && formal.length()==0)||(str.charAt(i)=='+' && formal.length()==0))
            {
            	if(str.charAt(i)>'0' && str.charAt(i)<'9')
            		flag = true;
            	formal = formal+ str.charAt(i);
            }else
            	if(!(str.charAt(i)==' ' && formal.length()==0))
            		break;
        }
        try {
        	result = Integer.parseInt(formal);
		} catch (Exception e) {
			result = 0;
		}
        if(flag && result==0)
        	if(formal.charAt(0)=='-')
        		result = Integer.MIN_VALUE;
        	else
        		result = Integer.MAX_VALUE;
        return result;
    }
}