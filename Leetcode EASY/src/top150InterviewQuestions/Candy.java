package top150InterviewQuestions;

import java.util.Arrays;

//Problem Statement :
//
//There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
//
//You are giving candies to these children subjected to the following requirements:
//
//Each child must have at least one candy.
//Children with a higher rating get more candies than their neighbors.
//Return the minimum number of candies you need to have to distribute the candies to the children.
//
// 
//
//Example 1:
//
//Input: ratings = [1,0,2]
//Output: 5

public class Candy {
	public int candy(int[] ratings) {
        int n = ratings.length;
        if(n==1) return n;
        int[] count = new int[n];
        Arrays.fill(count,1);
        
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                count[i]=count[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1] && count[i]<=count[i+1]){
                count[i] = count[i+1]+1;
            }
        }
        int ans = 0;
        for(int x : count){
            ans+=x;
        }
        return ans;
        
        
        
        // int n = ratings.length;
        // if(n==1) return n;
        // TreeMap<Integer,ArrayList<Integer>> h = new TreeMap<>();
        // for(int i=0;i<n;i++){
        //     if(!h.containsKey(ratings[i])){
        //         ArrayList<Integer> al = new ArrayList<Integer>();
        //         al.add(i);
        //         h.put(ratings[i],al);
        //     }
        //     else{
        //         h.get(ratings[i]).add(i);
        //     }

        // }

        // int[] count = new int[n];
        // Arrays.fill(count,1);

        // for(int x : h.keySet()){
        //     System.out.println(x);
        //     ArrayList<Integer> indexes = h.get(x);
        //     for(int index : indexes){
        //         if(index == 0 || index==n-1){
        //             if(index == 0){
        //                 if(ratings[0]>ratings[1]){
        //                     count[0] = count[1]+1;
        //                 }
        //             }
        //             else{
        //                 if(ratings[n-1]>ratings[n-2]){
        //                     count[n-1] = count[n-2]+1;
        //                 }
        //             }
        //         }
        //         else{
        //             if(ratings[index]>ratings[index+1] && ratings[index]>ratings[index-1]){
        //                 count[index] = Math.max(count[index+1],count[index-1])+1;
        //             }
        //             else if(ratings[index]>ratings[index+1]){
        //                 count[index] = count[index+1]+1;
        //             }
        //             else if(ratings[index]>ratings[index-1]){
        //                 count[index] = count[index-1]+1;
        //             }
        //         }
        //     }
        // }
        // int ans = 0;
        // for(int x : count){
        //     ans+=x;
        // }
        // return ans;
    }
}
