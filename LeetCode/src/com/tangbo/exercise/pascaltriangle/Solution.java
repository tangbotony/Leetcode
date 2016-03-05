package com.tangbo.exercise.pascaltriangle;
/*
 * 118. Pascal's Triangle My Submissions Question
	Total Accepted: 76082 Total Submissions: 232847 Difficulty: Easy
	Given numRows, generate the first numRows of Pascal's triangle.
	
	For example, given numRows = 5,
	Return
	
	[
	     [1],
	    [1,1],
	   [1,2,1],
	  [1,3,3,1],
	 [1,4,6,4,1]
	]
	Subscribe to see which companies asked this question
	
	Show Tags
	Show Similar Problems
 */
import java.util.List;
import java.util.ArrayList;
public class Solution {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> temp;
        if(numRows==0)
            return result;
        temp = new ArrayList<Integer>();
        temp.add(1);
        result.add(temp);
        for(int i=1;i<numRows;i++)
        {
            temp = new ArrayList<Integer>();
            for(int j=0;j<=i;j++)
            {
                temp.add((j-1<0 ? 0 : result.get(i-1).get(j-1))+(j<result.get(i-1).size()? result.get(i-1).get(j) : 0));
            }
            result.add(temp);
        }
        return result;
    }
}
