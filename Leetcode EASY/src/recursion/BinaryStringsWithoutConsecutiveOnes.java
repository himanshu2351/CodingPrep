package recursion;

import java.util.*;

//Problem statement :
//	
//You have been given an integer 'N'. Your task is to generate and return all binary strings of length 'N' such that there are no consecutive 1's in the string.
//
//
//
//A binary string is that string which contains only ‘0’ and ‘1’.
//
//
//
//For Example:
//Let ‘N'=3, hence the length of the binary string would be 3. 
//
//We can have the following binary strings with no consecutive 1s:
//000 001 010 100 101 
//
//Sample Input 1:
//4
//
//Sample Output 1:
//0000 0001 0010 0100 0101 1000 1001 1010

public class BinaryStringsWithoutConsecutiveOnes {
	
	public static List< String > generateString(int N) {
        // Write your code here.

        ArrayList<String> al = new ArrayList<String>();
        generate(N,al,"");

        return al;
    }

    public static void generate(int n, ArrayList<String> al,String x){
        if(n==0){
            al.add(x);
            return;
        }
        generate(n-1, al, x+"0");
        if(x.length()==0 || x.charAt(x.length()-1)!='1') generate(n-1,al,x+"1");

    }
}
