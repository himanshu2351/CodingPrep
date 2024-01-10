package stringQuestion;

import java.util.*;

//Problem statement :
//	
//You have been given an array/list of strings 'inputStr'. You are supposed to return the strings as groups of anagrams such that strings belonging to a particular group are anagrams of one another.
//
//An anagram is a word or phrase formed by rearranging the letters of a different word or phrase. We can generalize this in string processing by saying that an anagram of a string is another string with the same quantity of each character in it, in any order.
//
//Note:
//The order in which the groups and members of the groups are printed does not matter.
//For example:
//inputStr = {"eat","tea","tan","ate","nat","bat"}
//Here {“tea”, “ate”,” eat”} and {“nat”, “tan”} are grouped as anagrams. Since there is no such string in “inputStr” which can be an anagram of “bat”, thus, “bat” will be the only member in its group.
//
//Sample Input 1:
//2
//4
//abab baba aabb abbc
//5
//aecd bcda acbd abdc acda
//
//Sample Output 1 :
//aabb abab baba
//abbc
//abdc acbd bcda
//acda
//aecd

public class GroupAnagrams {
	public static ArrayList<ArrayList<String>> getGroupedAnagrams(ArrayList<String> inputStr, int n) {
		// Write your code here.
		ArrayList<ArrayList<String>> ans = new ArrayList<>();
		HashMap<String,ArrayList<String>> h = new HashMap<>();
		for(String x : inputStr){
			ArrayList<String> arr = new ArrayList<>();
			String y = "";
			for(int i=0;i<26;i++){
				int count = 0;
				char ch = (char)('a'+i);
				for(int j=0;j<x.length();j++){
					if(x.charAt(j)==ch){
						count++;
					}
				}
				y+=""+ch+count;
			}
			if(!h.containsKey(y)){
				arr.add(x);
				h.put(y, arr);
			}
			else{
				h.get(y).add(x);
			}
		}
		for(String key : h.keySet()){
			ans.add(h.get(key));
		}
		return ans;
	}
}
