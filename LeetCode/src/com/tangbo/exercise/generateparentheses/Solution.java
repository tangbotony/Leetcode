package com.tangbo.exercise.generateparentheses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 22. Generate Parentheses My Submissions QuestionEditorial Solution
	Total Accepted: 84548 Total Submissions: 230426 Difficulty: Medium
	Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
	
	For example, given n = 3, a solution set is:
	
	"((()))", "(()())", "(())()", "()(())", "()()()"
	
	Subscribe to see which companies asked this question
 */
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        if(n==0)
            return result;
        Map<Integer,Set<String>> temp = new HashMap<Integer,Set<String>>();
        Set<String> set = new HashSet<String>();
        set.add("()");
        temp.put(1,set);
        for(int i=2;i<=n;i++)
        {
            set = new HashSet<String>();
            for(int j=1;j<i-1;j++)
            {
            	String befor="";
            	for(int m=0;m<j;m++)
            		befor = befor+"(";
            	String end = "";
            	for(int m=0;m<j;m++)
            		end = end+")";
            	Set<String> medium = temp.get(i-j);
            	for (Iterator<String> iterator = medium.iterator(); iterator.hasNext();) {
					String string = (String) iterator.next();
					set.add(befor+string+end);
				}
            }
            for(int j=1;j<i;j++)
            {
                Set<String> head = temp.get(j);
                Set<String> tail = temp.get(i-j);
                for (Iterator<String> iterator = head.iterator(); iterator.hasNext();) {
					String string1 = (String) iterator.next();
					for (Iterator<String> iterator2 = tail.iterator(); iterator2.hasNext();) {
						String string2 = (String) iterator2.next();
						 set.add(string1+string2);
					}
				}
            }
            set.add(primary(i));
            temp.put(i,set);
        }
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			 result.add((String) iterator.next());
			
		}
        return result;
    }
    public String primary(int n)
    {
        String result = "";
        for(int i=0;i<n;i++)
            result = result +"(";
        for(int i=0;i<n;i++)
            result = result + ")";
        return result;
    }
}
