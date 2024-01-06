package stringQuestion;

//Problem statement :
//	
//You have been given two strings ‘STR1’ and ‘STR2’.
//
//Your task is to find if ‘STR1’ is a subsequence of ‘STR2’.
//
//A subsequence of a string is a new string that can be derived from the original string by deleting some characters (can be none) without changing the relative ordering of other characters.
//
//Example:
//‘ACE’ is a subsequence of ‘ABCDE’ because ‘ACE’ can be formed by deleting ‘B’ and ‘D’ without changing the relative order of characters. ‘ADB’ is not a subsequence of ‘ABCDE’ because we can get ‘ABD’ from ‘ABCDE’ but not ‘ADB’ and in ‘ADB’ relative order of ‘B’ and ‘D’ are different from original strings.
//Note:
//1.Strings ‘STR1’ and ‘STR2’ consists only of English uppercases.
//
//2.Length of string ‘STR2’ will always be greater than or equal to the length of string ‘STR1’.
//Example:
//
//For example, the given ‘STR1’ is ‘BAE’ and ‘STR2’ is ‘ABADE’. 
//String ‘STR1’ is a subsequence of string ‘STR2’ because ‘BAE’ can be formed by deleting ‘A’ and ‘D’ from ‘ABADE’ and the relative ordering of the characters of the string ‘ABADE’ persists.

public class IsSubsequence {
	
	public static String isSubsequence(String str1, String str2) {    
    	// Write your code here.
		int i = 0;

		while(str1.length()>0 && i<str2.length()){
			if(str2.charAt(i)==str1.charAt(0)){
				str1 = str1.substring(1);
			}
			i++;
		}

		if(str1.length()<=0) return "True";
		return "False";	
	}
}
