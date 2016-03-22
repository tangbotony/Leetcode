package com.tangbo.exercise.firstbadversion;
/*
 * 278. First Bad Version My Submissions Question
	Total Accepted: 37082 Total Submissions: 167563 Difficulty: Easy
	You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
	
	Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
	
	You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
	
	Credits:
	Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
	
	Subscribe to see which companies asked this question
	
	Show Tags
	Show Similar Problems

 */
/*public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // write your code here
        if (n == 0) {
            return -1;
        }
        int start = 1, end = n, mid;
        while (start + 1 < end) {
            mid = start + (end - start)/2;
            if (isBadVersion(mid) == false) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (isBadVersion(start) == true) {
            return start;
        } else if (isBadVersion(end) == true) {
            return end;
        } else {
            return -1; // not found
        }
    }
}*/