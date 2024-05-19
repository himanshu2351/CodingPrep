package top150InterviewQuestions;

//Problem Statement :
//
//Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.
//According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.
//
//Example 1:
//
//Input: citations = [3,0,6,1,5]
//Output: 3

public class H_Index {
	
	public int hIndex(int[] citations) {
        int n = citations.length;
        int[] temp = new int[n+1];

        for(int x : citations){
            if(x<n){
                temp[x]++;
            }
            else{
                temp[n]++;
            }
        }
        int sum = 0;
        for(int i=n;i>=0;i--){
            sum = sum+temp[i];
            temp[i] = sum;
        }
    	int max = 0;
        for(int i=0;i<n+1;i++){
            if(i<=temp[i]){
                max = i;
            }
        }
        return max;
    }
}
