package top150InterviewQuestions;

//Problem Statement :
//
//Given an absolute path for a Unix-style file system, which begins with a slash '/', transform this path into its simplified canonical path.
//
//In Unix-style file system context, a single period '.' signifies the current directory, a double period ".." denotes moving up one directory level, and multiple slashes such as "//" are interpreted as a single slash. In this problem, treat sequences of periods not covered by the previous rules (like "...") as valid names for files or directories.
//
//The simplified canonical path should adhere to the following rules:
//
//It must start with a single slash '/'.
//Directories within the path should be separated by only one slash '/'.
//It should not end with a slash '/', unless it's the root directory.
//It should exclude any single or double periods used to denote current or parent directories.
//Return the new path.
//
//Example 1:
//
//Input: path = "/home/"
//
//Output: "/home"

import java.util.Stack;

public class SimplifyPath {
	
	public String simplifyPath(String s) {
        if(s.length()==1) return s;
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=s.length();i++){
            if(i==s.length() || s.charAt(i)=='/'){
                String x = sb.toString();
                if(x.equals("") || x.equals(".")){
                    
                }
                else if(x.equals("..")){
                    if(!st.isEmpty()){
                        st.pop();
                    }
                }
                else{
                    st.push(x);
                }
                sb = new StringBuilder();
            }
            else{
                sb.append(""+s.charAt(i));
            }
        }
        sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,"/"+st.pop());
        }
        return sb.toString().length()==0 ? "/" : sb.toString();
    }
}
