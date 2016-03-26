package com.tangbo.exercise.bulbswitcher;
/*
 * 319. Bulb Switcher My Submissions Question
	Total Accepted: 14482 Total Submissions: 36181 Difficulty: Medium
	There are n bulbs that are initially off. You first turn on all the bulbs. Then, you turn off every second bulb. On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb. Find how many bulbs are on after n rounds.
	
	Example:
	
	Given n = 3. 
	
	At first, the three bulbs are [off, off, off].
	After first round, the three bulbs are [on, on, on].
	After second round, the three bulbs are [on, off, on].
	After third round, the three bulbs are [on, off, off]. 
	
	So you should return 1, because there is only one bulb is on.
	Subscribe to see which companies asked this question
	
	Show Tags
 */
public class Solution {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
	//如果没有好好观察就是下面这个效果
	/*
    public int bulbSwitch(int n) {
        int result = 0;
        for(int i = 1;i<=n;i++)
        {
            if(isOdd(i))
                result++;
        }
        return result;
    }
    boolean isOdd(int n)
    {
        int count =0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                count ++;
        }
        return count%2==0? false:true;
    }*/
}
