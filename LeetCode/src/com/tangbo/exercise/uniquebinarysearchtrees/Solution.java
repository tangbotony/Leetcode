package com.tangbo.exercise.uniquebinarysearchtrees;
/*
 * 96. Unique Binary Search Trees My Submissions QuestionEditorial Solution
	Total Accepted: 78951 Total Submissions: 212484 Difficulty: Medium
	Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
	
	For example,
	Given n = 3, there are a total of 5 unique BST's.
	
	   1         3     3      2      1
	    \       /     /      / \      \
	     3     2     1      1   3      2
	    /     /       \                 \
	   2     1         2                 3
	Subscribe to see which companies asked this question
	
	Show Tags
	Show Similar Problems

 */
public class Solution {
    public int numTrees(int n) 
    { 
      if (n <= 0) {
          return 0;
      } else if (n == 1) {
          return 1;
      }
      int[] result = new int[n + 1];
      result[0] = 0;
      result[1] = 1;


      // 求f(2)...f(n)
      for (int i = 2; i <= n; i++) {
          // 求f(i)
          result[i] = 2 * result[i - 1];
          for (int j = 1; j <= i - 1 ; j++) {
              result[i] += result[j]*result[i - 1 -j];
          }

      }
      return result[n];
    }
}
