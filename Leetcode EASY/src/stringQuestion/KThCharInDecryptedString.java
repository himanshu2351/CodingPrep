package stringQuestion;

//Problem statement :
//	
//You have been given an Encrypted String where repetitions of substrings are represented as substring followed by the count of substrings.
//
//Example: String "aabbbcdcdcd" will be encrypted as "a2b3cd3".
//You need to find the 'K'th character of Decrypted String. Decrypted String would have 1-based indexing.
//
//Note :
//
//Input string will always be lowercase characters without any spaces.
//
//If the count of a substring is 1 then also it will be followed by Integer '1'.
//Example: "aabcdee" will be Encrypted as "a2bcd1e2"
//This means it's guaranteed that each substring is followed by some Integer.
//
//Also, the frequency of encrypted substring can be of more than one digit. For example, in "ab12c3", ab is repeated 12 times. No leading 0 is present in the frequency of substring.
//
//The frequency of a repeated substring can also be in parts.
//Example: "aaaabbbb" can also have "a2a2b3b1" as Encrypted String.
//
//Sample Input 1 :
//a2b3cd3
//8
//
//Sample Output 1 :
//c

public class KThCharInDecryptedString {
	
	public static char kThCharaterOfDecryptedString(String s, Long k) 
    {
        // Write your code here
        String x = "";
        String num = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>96){
                while(ch>96){
                    x+=""+ch;
                    ch = s.charAt(++i);
                }
            }
            if(ch<96){
                while(ch<96){
                    num+=""+ch;
                    if(i+1<s.length())ch = s.charAt(++i);
                    else break;
                }
            }
            i--;
            if(k>x.length()*Long.valueOf(num)){
                k-=x.length()*Long.valueOf(num);
                x = "";
                num = "";
            }
            else{
                break;
            }
        }

        int i = (int)((k-1)%x.length());
        return x.charAt(i);
    }
}
