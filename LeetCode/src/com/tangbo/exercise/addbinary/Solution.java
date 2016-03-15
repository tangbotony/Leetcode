package com.tangbo.exercise.addbinary;
/*
 * 67. Add Binary My Submissions Question
	Total Accepted: 77707 Total Submissions: 288397 Difficulty: Easy
	Given two binary strings, return their sum (also a binary string).
	
	For example,
	a = "11"
	b = "1"
	Return "100".
	
	Subscribe
 */
public class Solution {
/*C++版本
 * class Solution {
public:
    string addBinary(string a, string b) {
         string result = "";  
        int c = 0;  
        int i = a.size() - 1;  
        int j = b.size() - 1;  
          
        while(i >= 0 || j >=0 ||c ==1)  
        {  
            c += i >= 0 ? a[i--] - '0':0;  
            c += j >= 0 ? b[j--] - '0':0;  
            result = char( c% 2 + '0') + result;  
            c /= 2;  
              
        }  
          
        return result;  
    }
};
 */
}
