package stack;

import java.util.Stack;

//Problem Statement :
//
//Given a string word to which you can insert letters "a", "b" or "c" anywhere and any number of times, return the minimum number of letters that must be inserted so that word becomes valid.
//A string is called valid if it can be formed by concatenating the string "abc" several times.
//
//Example 1:
//
//Input: word = "b"
//Output: 2


public class MinAdditionToMakeValidString {
	public int addMinimum(String word) {
        Stack<Character> st = new Stack<>();
        int c = 0;
        for(int i=0;i<word.length();i++){
            if(st.isEmpty() || st.peek()=='c'){
                if(word.charAt(i)=='a'){
                    st.push('a');
                }
                else if(word.charAt(i)=='b'){
                    c+=1;
                    st.push('a');
                    st.push('b');
                }
                else{
                    c+=2;
                    st.push('a');
                    st.push('b');
                    st.push('c');
                }
            }
            else if(st.peek()+1!=word.charAt(i)){
                st.push((char)(st.peek()+1));
                i--;
                c++;
            }
            else{
                st.push(word.charAt(i));
            }
        }
        if(st.peek()=='a'){
            c+=2;
        }
        else if(st.peek()=='b'){
            c++;
        }
        return c;
    }
}
