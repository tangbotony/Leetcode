package com.tangbo.exercise.countprimes;
/*
 * 204. Count Primes My Submissions Question
	Total Accepted: 56334 Total Submissions: 236821 Difficulty: Easy
	Description:
	
	Count the number of prime numbers less than a non-negative number, n.
	
	Credits:
	Special thanks to @mithmatt for adding this problem and creating all test cases.
	
	Show Hint 

 */
public class Solution {
    public int countPrimes(int n) {  
    //2,3,5,7,11,13,17   
    //20  5  
    //init check  n  
    boolean[] a = new boolean[n];  
    for(int i=2; i*i<n; i++) {  
       if(!a[i]) {  
           for(int j=i; i*j<n; j++) {  
               a[i*j] = true;  
           }  
       }  
    }  
    int c=0;  
      
    for(int i=2; i<n; i++) {  
        if(a[i] == false) ++c;  
    }  
    return c;  
   }  
}