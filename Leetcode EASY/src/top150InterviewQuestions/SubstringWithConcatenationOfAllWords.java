package top150InterviewQuestions;

//Problem Statement :
//
//You are given a string s and an array of strings words. All the strings of words are of the same length.
//
//A concatenated string is a string that exactly contains all the strings of any permutation of words concatenated.
//
//For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab" are all concatenated strings. "acdbef" is not a concatenated string because it is not the concatenation of any permutation of words.
//Return an array of the starting indices of all the concatenated substrings in s. You can return the answer in any order.
//
//Example 1:
//
//Input: s = "barfoothefoobarman", words = ["foo","bar"]
//
//Output: [0,9]

import java.util.*;

public class SubstringWithConcatenationOfAllWords {
	
public List<Integer> findSubstring(String s, String[] words) {
        
        List<Integer> al = new ArrayList<Integer>();
        int len = words[0].length();
        int tot = len*words.length;
        int n = s.length();
        if(s.length()<tot) return al;
        HashMap<String, Integer> freq = new HashMap<>();

        for(String word : words){
            freq.put(word,freq.getOrDefault(word,0)+1);
        }

        for(int i=0;i<n-tot+1;i++){
            String substr = s.substring(i,i+tot);
            HashMap<String, Integer> temp = new HashMap<>();
            for(int j=0;j<substr.length();j+=len){
                String str = substr.substring(j,j+len);
                temp.put(str,temp.getOrDefault(str,0)+1);
            }
            if(temp.equals(freq)){
                al.add(i);
            }
        }
        return al;
    }
}
