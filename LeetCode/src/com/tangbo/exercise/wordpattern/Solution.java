package com.tangbo.exercise.wordpattern;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 */
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String words[] = str.split(" ");
        Map<Character,String> patternMap = new HashMap<Character,String>();
        Map<String,String> strMap = new HashMap<String,String>();
        Map<String,Character> map = new HashMap<String,Character>();
        Map<Character,String> count = new HashMap<Character,String>();
        if(words.length != pattern.length())
            return false;
        for(int i=0;i<pattern.length();i++)
        {
            if(patternMap.get(pattern.charAt(i))==null)
                patternMap.put(pattern.charAt(i),i+"");
            else
                 patternMap.put(pattern.charAt(i),patternMap.get(pattern.charAt(i))+i);
                 
            if(strMap.get(words[i])==null)
                strMap.put(words[i],i+"");
            else
                strMap.put(words[i],strMap.get(words[i])+i);
        }
        for(int i=0;i<words.length;i++)
        {
            if(map.get(words[i])==null)
            {
            	if(count.get(pattern.charAt(i))!=null)
            		return false;
            	else
            	{
                    map.put(words[i],pattern.charAt(i));
                    count.put(pattern.charAt(i), words[i]);
            	}
            }else
            {
                if(map.get(words[i])==pattern.charAt(i))
                {
                    if(!strMap.get(words[i]).equals(patternMap.get(pattern.charAt(i))))
                        return false;
                }else
                    return false;
            }
        }
        return true;
    }
}