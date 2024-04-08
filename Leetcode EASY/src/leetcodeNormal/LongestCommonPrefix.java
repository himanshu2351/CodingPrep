package leetcodeNormal;
//0014 - Longest Common Prefix

/*
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */



//Time Complexity - O(m+nlogn) m -> sizze of shortest element, nlogn -> Arrays.sort
//Space Complexity - O(1)



import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String smallestString = strs[0];
        String largestString = strs[strs.length-1];
        String ans = "";
        for(int i=0;i<smallestString.length();i++){
            if(smallestString.charAt(i)==largestString.charAt(i)){
                ans+=smallestString.charAt(i);
            }else{
                break;
            }
        }
        return ans;
    }
}
