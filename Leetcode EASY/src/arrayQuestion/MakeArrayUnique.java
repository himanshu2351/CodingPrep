package arrayQuestion;

//Problem statement  :
//	
//You are given an array ‘ARR’ of size ‘N,’ and you have to tell the minimum number of elements that need to be removed such that the array contains all distinct elements. More formally, there should not be any ‘I’ and ‘J’ such that ‘I’ != ‘J’ and ‘ARR’[‘I’] = ‘ARR’[‘J’].
//
//For example:
//
//Given ‘N’ = 4, 
//'ARR' = { 1, 2, 1, 2} 
//Then the answer is 2 because 1 and 2 are repeated once therefore we need to remove 2 elements.
//
//Sample Input 1 :
//2
//4
//1 2 1 2
//5
//3 6 7 12 13 
//
//Sample Output 1 :
//2
//0  

import java.util.*;

public class MakeArrayUnique {
	
	public static int minElementsToRemove(ArrayList<Integer> arr) {

		// Write your code here
		Set<Integer> s = new HashSet<>();
		for(int x : arr){
			s.add(x);
		}

		return arr.size()-s.size();
	}
}
