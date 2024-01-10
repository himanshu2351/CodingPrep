package stringQuestion;

//Problem statement
//Ninja is now bored with numbers and is now playing with characters but hates when he gets repeated characters. Ninja is provided a string, and he wants to return the first unique character in the string.The string will contain characters only from the English alphabet set, i.e., ('A' - 'Z') and ('a' - 'z'). If there is no non-repeating character, print the first character of the string. If there is no non-repeating character, return the first character of the string.
//
//Sample Input 1 :
//2
//aDcadhc
//AabBcC
//
//Sample Output 1:
// D
// A	


public class FirstNonRepeatingCharacter {
	public static char firstNonRepeatingCharacter(String str) {

		// Write your code here
		int[] arr = new int[129];

		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			arr[ch]++;
		}

		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(arr[ch]==1) return ch;
		}

		return str.charAt(0);

	}
}
