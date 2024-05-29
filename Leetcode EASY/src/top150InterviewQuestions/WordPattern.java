package top150InterviewQuestions;

//Problem Statement :
//
//Given a pattern and a string s, find if s follows the same pattern.
//
//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
//
//Example 1:
//
//Input: pattern = "abba", s = "dog cat cat dog"
//Output: true

import java.util.*;

public class WordPattern {
	
	public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(arr.length!=pattern.length()) return false;

        Map<Character,String> h = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(h.containsKey(ch)){
                if(!h.get(ch).equals(arr[i])){
                    return false;
                }
            }
            else{
                if(h.values().contains(arr[i])){
                    return false;
                }
                else{
                    h.put(ch,arr[i]);
                }
            }
        }
        return true;
    }
}
