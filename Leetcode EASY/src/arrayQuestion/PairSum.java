package arrayQuestion;

//Problem statement :
//	
//You are given an array/list ‘ARR’ consisting of ‘N’ distinct integers arranged in ascending order. You are also given an integer ‘TARGET’. Your task is to count all the distinct pairs in ‘ARR’ such that their sum is equal to ‘TARGET’.
//
//Note:
//
//1. Pair (x,y) and Pair(y,x) are considered as the same pair. 
//
//2. If there exists no such pair with sum equals to 'TARGET', then return -1.
//Example:
//
//Let ‘ARR’ = [1 2 3] and ‘TARGET’ = 4. Then, there exists only one pair in ‘ARR’ with a sum of 4 which is (1, 3). (1, 3) and (3, 1) are counted as only one pair.
//
//Sample Input 1:
//2
//5 6
//1 2 3 4 5
//6 7
//1 2 3 4 5 6
//
//Sample Output 1:
//2
//3

public class PairSum {
	
	public static int pairSum(int arr[], int n, int target) {
        // Write your code here.

        int count = 0;
        int s = 0, e = n-1;

        while(s<e){
            if(arr[s] + arr[e] == target){
                count++;
                s++;
                e--;
            }
            else if(arr[s] + arr[e] < target){
                s++;
            }
            else {
                e--;
            }
        }
        return count == 0 ? -1 : count;
    }
}
