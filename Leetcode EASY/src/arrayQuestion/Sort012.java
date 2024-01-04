package arrayQuestion;

//Problem statement :
//	
//You have been given an integer array/list(ARR) of size 'N'. It only contains 0s, 1s and 2s. Write a solution to sort this array/list.
//
//Note :
//Try to solve the problem in 'Single Scan'. ' Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.
//
//Sample Input 1 :
//2
//6
//0 1 2 2 1 0
//7
//0 1 2 1 2 1 2
//
//Sample Output 1 :
//0 0 1 1 2 2
//0 1 1 1 2 2 2

public class Sort012 {
	
	public static void sort012(int[] arr)
    {
        //Write your code here
        int s = 0;
        int e = arr.length-1;

        int i=0;
        while(i<arr.length && i<=e){
            if(arr[i]==1){
                i++;
                continue;
            } 
            else if(arr[i]==0){
                int t = arr[s];
                arr[s++] = 0;
                arr[i++] = t;
            }
            else{
                int t= arr[e];
                arr[e--] = 2;
                arr[i] = t;
            }
        }
    }
}
