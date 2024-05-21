package top150InterviewQuestions;

//Problem Statement :
//
//Given two strings s and t, determine if they are isomorphic.
//
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//
//All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
//
//Example 1:
//
//Input: s = "egg", t = "add"
//Output: true

import java.util.*;

public class IsIsomorphic {
	
	public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> h = new HashMap<>();
        for(int i=0;i<s.length();i++){
            
            if(h.containsKey(s.charAt(i))){
                if(h.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            else{
                h.put(s.charAt(i),t.charAt(i));
            }
        }
        Set<Character> set = new HashSet<>(h.values());
        return set.size()==h.size() ? true : false;
    }
}
