package top150InterviewQuestions;

//Problem Statement :
//
//Given a string s consisting of words and spaces, return the length of the last word in the string.
//
//A word is a maximal 
//substring
// consisting of non-space characters only.
//
// 
//
//Example 1:
//
//Input: s = "Hello World"
//Output: 5

public class LenOfLastWord {
	public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            else{
                len++;
            }
        }
        return len;
    }
}
