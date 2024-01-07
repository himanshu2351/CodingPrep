package stringQuestion;

//Problem statement :
//
//You have been given two strings 'STR1' and 'STR2'. You have to check whether the two strings are anagram to each other or not.
//
//Note:
//Two strings are said to be anagram if they contain the same characters, irrespective of the order of the characters.
//Example :
//If 'STR1' = “listen” and 'STR2' = “silent” then the output will be 1.
//
//Both the strings contain the same set of characters.
//
//Sample Input 1:
//2
//triangle integral
//hearts earth
//
//Sample Output 1:
//1
//0

public class CheckAnagram {
	public static boolean areAnagram(String str1, String str2){
        // Write your code here.

        int[] arr = new int[127];

        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)]++;
        }

        for(int i=0;i<str2.length();i++){
            arr[str2.charAt(i)]--;
        }

        for(int x : arr){
            if(x<0 || x%2 != 0) return false;
        }
        return true;
    }
}
