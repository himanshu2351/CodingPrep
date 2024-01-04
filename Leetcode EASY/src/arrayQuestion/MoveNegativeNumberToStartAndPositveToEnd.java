package arrayQuestion;

//Problem statement :
//	
//You are given an array 'ARR' consisting of 'N' integers. You need to rearrange the array elements such that all negative numbers appear before all positive numbers.
//
//Note:
//The order of elements in the resulting array is not important.
//
//Example:
//Let the array be [1, 2, -3, 4, -4, -5]. 
//On rearranging the array such that all negative numbers appear before all positive numbers 
//we get the resulting array [-3, -5, -4, 2, 4, 1].

public class MoveNegativeNumberToStartAndPositveToEnd {
	public static int[] separateNegativeAndPositive(int a[]) {
        int pos = 0;

        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                int t = a[pos];
                a[pos++] = a[i];
                a[i] = t;
            }
        }
        return a;
    }
}
