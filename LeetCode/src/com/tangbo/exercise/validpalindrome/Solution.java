package com.tangbo.exercise.validpalindrome;
/*
 * 125. Valid Palindrome My Submissions Question
	Total Accepted: 94395 Total Submissions: 400787 Difficulty: Easy
	Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
	
	For example,
	"A man, a plan, a canal: Panama" is a palindrome.
	"race a car" is not a palindrome.
	
	Note:
	Have you consider that the string might be empty? This is a good question to ask during an interview.
	
	For the purpose of this problem, we define empty string as valid palindrome.
	
	Subscribe to see which companies asked this question
 */
public class Solution {
    public boolean isPalindrome(String s) {
        //// A-65   Z-90    a-97 z-122
        s = s.toLowerCase();
        int star = 0;
        int end = s.length()-1;
        while(star<end)
        {
            if(isValid(s.charAt(star)))
            {
                if(isValid(s.charAt(end)))
                {
                    if(s.charAt(star)!=s.charAt(end))
                        return false;
                    else
                    {
                    	end--;
                    	star++;
                    }
                }else
                    end--;
            }else
                star++;
        }
        return true;
    }
    private boolean isValid(char c) {  
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')  
                || (c >= '0' && c <= '9')) {  
            return true;  
        }  
        return false;  
    }
}