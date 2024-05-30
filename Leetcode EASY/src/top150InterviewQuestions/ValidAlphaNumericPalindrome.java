package top150InterviewQuestions;

// Problem Statement :

//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
//
//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true

public class ValidAlphaNumericPalindrome {
	
	public boolean isPalindrome(String s) {
        s =s.toLowerCase();
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            if(!(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)))){
                i++;
                continue;
            }
            if(!(Character.isAlphabetic(s.charAt(j)) || Character.isDigit(s.charAt(j)))){
                j--;
                continue;
            }
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
            
        }
        return true;
    }
}
