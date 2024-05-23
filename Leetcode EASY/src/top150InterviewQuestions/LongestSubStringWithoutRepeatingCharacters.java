package top150InterviewQuestions;

//Problem Statement :
//
//Given a string s, find the length of the longest 
//substring
// without repeating characters.
//
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3


import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharacters {
	
	public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int st = 0;
        int max = 0;
        HashSet<Character> h = new HashSet<>(); 
        for(int i=0;i<s.length();i++){
            if(!h.contains(s.charAt(i))){
                h.add(s.charAt(i));
                count++;
                max = Math.max(max,count);
            }
            else{
                while(st<s.length() && s.charAt(st)!=s.charAt(i)){
                    h.remove(s.charAt(st));
                    count--;
                    st++;
                }
                st++;
            }
        }
        return max;
    }
	
}
