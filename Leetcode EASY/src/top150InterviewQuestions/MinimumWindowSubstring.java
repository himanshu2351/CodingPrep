package top150InterviewQuestions;

//Problem Statement :
//
//Given two strings s and t of lengths m and n respectively, return the minimum window 
//substring
// of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
//
//The testcases will be generated such that the answer is unique.
//
//Example 1:
//
//Input: s = "ADOBECODEBANC", t = "ABC"
//Output: "BANC"

import java.util.HashMap;

public class MinimumWindowSubstring {
	
	public String minWindow(String s, String t) {
        int max = s.length();
        int counter = t.length();
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i=0;i<t.length();i++){
            h.put(t.charAt(i),h.getOrDefault(t.charAt(i),0)+1);
        }
        String ans = "";
        int st = 0, e = 0;
        while(e<s.length()){
            if(h.containsKey(s.charAt(e))){
                counter = h.get(s.charAt(e))>0 ? counter-1: counter;
                h.put(s.charAt(e),h.get(s.charAt(e))-1);
            }
            if(counter==0){
                while(st<e){
                    if(h.containsKey(s.charAt(st))){
                        boolean check = h.get(s.charAt(st))+1<=0 ? true : false;
                        if(check){
                            h.put(s.charAt(st),h.get(s.charAt(st))+1);
                            st++;
                        }
                        else{
                            break;
                        }
                    }
                    else{
                        st++;
                    }
                }
                String temp = s.substring(st,e+1);
                if(ans.isEmpty() || ans.length()>temp.length()){
                    ans = temp;
                }
            }
            e++;
        }
        return ans;
    }
}
