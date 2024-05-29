package top150InterviewQuestions;

//Problem statement :
//
//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//
//Each letter in magazine can only be used once in ransomNote.
//
//Example 1:
//
//Input: ransomNote = "a", magazine = "b"
//Output: false

import java.util.*;

public class RansomNote {
	
	public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> h = new HashMap<>();
        for(int i = 0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            h.put(ch,h.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            if(h.containsKey(ch)){
                if(h.get(ch)<=0) return false;
                h.put(ch,h.get(ch)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
