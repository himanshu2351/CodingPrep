package stringQuestion;

import java.util.Scanner;

//Problem statement :
//	
//Reverse the given string word-wise. The last word in the given string should come at 1st place, the last-second word at 2nd place, and so on. Individual words should remain as it is.
//
//Sample Input 1:
//Welcome to Coding Ninjas
//
//Sample Output 1:
//Ninjas Coding to Welcome


public class ReverseStringWordWise {
	

    static String reverseStringWordWise(String input) {
        // Write your code here
        int end = input.length();
        StringBuilder sb = new StringBuilder();
        int i=input.length()-1;
        while(i>=0){
            if(input.charAt(i)==' '){
                sb.append(input.substring(i+1,end));
                sb.append(" ");
                end = i;
            }
            i--;
        }
        sb.append(input.substring(i+1,end));
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
