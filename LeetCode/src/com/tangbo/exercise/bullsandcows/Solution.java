package com.tangbo.exercise.bullsandcows;

import java.util.HashMap;
import java.util.Map;

/*
 * 299. Bulls and Cows My Submissions Question
	Total Accepted: 21349 Total Submissions: 74075 Difficulty: Easy
	You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.
	
	For example:
	
	Secret number:  "1807"
	Friend's guess: "7810"
	Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
	Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls and B to indicate the cows. In the above example, your function should return "1A3B".
	
	Please note that both secret number and friend's guess may contain duplicate digits, for example:
	
	Secret number:  "1123"
	Friend's guess: "0111"
	In this case, the 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow, and your function should return "1A1B".
	You may assume that the secret number and your friend's guess only contain digits, and their lengths are always equal.
 */
public class Solution {
    public String getHint(String secret, String guess) {
    	int cows =0;
    	Map<Character, Integer> count = new HashMap<Character, Integer>();
    	Map<Integer, Integer> bullsCount = new HashMap<>();
    	for(int i=0;i<secret.length();i++)
    	{
    		if((secret.charAt(i)+"").equals(guess.charAt(i)+""))
    		{
    			bullsCount.put(i, 1);
    		}else
    		{
    			if(count.get(secret.charAt(i))==null)
    			{
    				count.put(secret.charAt(i), 1);
    			}else
    			{
    				count.put(secret.charAt(i), count.get(secret.charAt(i))+1);
    			}
    		}
    	}
    	for(int j=0;j<secret.length();j++)
    	{
    		if(bullsCount.get(j)==null)
    		{
    			if(count.get(guess.charAt(j))!=null)
    			{
    				cows++;
    				if(count.get(guess.charAt(j))-1==0)
    				{
    					count.remove(guess.charAt(j));
    				}else
    				{
        				count.put(guess.charAt(j), count.get(guess.charAt(j))-1);
    				}
    			}
    		}
    	}
        return bullsCount.size()+"A"+cows+"B";
    }
}