package top150InterviewQuestions;

//Problem Statement:
//
//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//		 
//
//Example 1:
//
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0

public class IndexOfFirstOccurance {
	
	public int strStr(String haystack, String needle) {
        
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int j=1;
                while(i+j<haystack.length() && j<needle.length() && 
                haystack.charAt(i+j)==needle.charAt(j)){
                    j++;
                }
                if(j==needle.length()) return i;
            }
        }
        return -1;
    }
}
