package top150InterviewQuestions;

//Problem Statement :
//
//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
//
//Write the code that will take a string and make this conversion given a number of rows:
//
//string convert(string s, int numRows);
// 
//
//Example 1:
//
//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"
	
public class ZigZagConversion {

	public String convert(String s, int numRows) {
        if(numRows==1 || numRows == s.length()) return s;
        int c = 2*(numRows-1);
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<numRows;i++){
            int j = i;
            while(j<len){
                sb.append(s.charAt(j));
                if(i==0 || i== numRows-1) j+=c;
                else{
                    j=j+c-2*i;
                    if(j<len){
                        sb.append(s.charAt(j));
                        j+=2*i;
                    }

                }
            }
        }
        return sb.toString();
    }
}
