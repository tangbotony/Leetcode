package com.tangbo.exercise.compareversionnumbers;
/*
 * 165. Compare Version Numbers My Submissions Question
	Total Accepted: 48554 Total Submissions: 282875 Difficulty: Easy
	Compare two version numbers version1 and version2.
	If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
	
	You may assume that the version strings are non-empty and contain only digits and the . character.
	The . character does not represent a decimal point and is used to separate number sequences.
	For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
	
	Here is an example of version numbers ordering:
	
	0.1 < 1.1 < 1.2 < 13.37
	Credits:
	Special thanks to @ts for adding this problem and creating all test cases.
	
	Subscribe to see which companies asked this question
 */
public class Solution {
    public int compareVersion(String version1, String version2) {
        String v1s[] = version1.split("\\.");
        String v2s[] = version2.split("\\.");
        int i=0;
        for(i=0;i<Math.min(v1s.length, v2s.length);i++)
        {
            if(Integer.parseInt(v1s[i])!=Integer.parseInt(v2s[i]))
            {
            	if(Integer.parseInt(v1s[i])>Integer.parseInt(v2s[i]))
            		return 1;
            	else if(Integer.parseInt(v1s[i])<Integer.parseInt(v2s[i]))
            		return -1;
            	else
            		return 0;
            }
        }
        if(v1s.length>v2s.length)
        {
            for(;i<v1s.length;i++)
            {
                if(Integer.parseInt(v1s[i])>0)
                    return 1;
            }
        	return 0;
        }else if(v1s.length<v2s.length)
        {
        	for(;i<v2s.length;i++)
            {
                if(Integer.parseInt(v2s[i])>0)
                    return -1;
            }
        	return 0;
        }else{
        	return 0;
        }
    }
}
