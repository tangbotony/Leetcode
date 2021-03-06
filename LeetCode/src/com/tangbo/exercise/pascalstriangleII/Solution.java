package com.tangbo.exercise.pascalstriangleII;

import java.util.ArrayList;
import java.util.List;

/*
 * 119. Pascal's Triangle II My Submissions Question
	Total Accepted: 68489 Total Submissions: 216486 Difficulty: Easy
	Given an index k, return the kth row of the Pascal's triangle.
	
	For example, given k = 3,
	Return [1,3,3,1].
	
	Note:
	Could you optimize your algorithm to use only O(k) extra space?
	
	Subscribe to see which companies asked this question
 */

public class Solution {
	public List<Integer> getRow(int rowIndex) {  
        List<Integer> list = new ArrayList<Integer> (rowIndex + 1);  
        list.add(1);  
          
        if (rowIndex == 0) {  
            return list;  
        }  
          
        list.add(1);  
        if (rowIndex == 1) {  
            return list;  
        }     
          
        for (int i = 2; i <= rowIndex; ++i) {  
            list.add(1);  
            for (int j = i - 1; j > 0; --j) {  
                list.set(j, list.get(j) + list.get(j - 1));  
            }  
        }  
        return list;  
    }  
}
