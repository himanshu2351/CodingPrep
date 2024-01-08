package stringQuestion;

//Problem statement :
//	
//You have been given a text message. You have to return the Run-length Encoding of the given message.
//
//Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent repeated successive characters as the character and a single count. For example, the string "aaaabbbccdaa" would be encoded as "a4b3c2d1a2".
//
//Sample Input 1 :
//3
//aabbc
//abcd
//abbdcaas
//
//Sample Output 1 :
//a2b2c1
//a1b1c1d1
//a1b2d1c1a2s1

public class EncodeTheMessage {
	public static String encode(String message) {
		// Write your code here.
		StringBuilder sb = new StringBuilder();
		char ch = message.charAt(0);
		int count = 1;

		for(int i=1;i<=message.length();i++){

			if(i==message.length()){
				sb.append(""+ch+count);
				return sb.toString();
			}
			if(message.charAt(i)!=ch){
				sb.append(""+ch+count);
				ch = message.charAt(i);
				count = 1;
			}
			else{
				count++;
			}
		}

		return "";
	}
}
