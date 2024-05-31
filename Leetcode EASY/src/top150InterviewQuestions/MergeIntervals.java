package top150InterviewQuestions;

//Problem Statement :
//
//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
//
//Example 1:
//
//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]

import java.util.*;

public class MergeIntervals {
	
	public int[][] merge(int[][] intervals) {
        ArrayList<int[]> al = new ArrayList<>();
        int[] a = new int [2];
        Arrays.sort(intervals,Comparator.comparingInt(i -> i[0]));

        a[0] = intervals[0][0];
        a[1] = intervals[0][1];
        al.add(a);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=a[1]){
                a[1] = Math.max(intervals[i][1],a[1]);
            }
            else{
                a = intervals[i];
                al.add(a);
            }
        }
        int[][] ans = new int[al.size()][2];
        for(int i=0;i<al.size();i++){
            ans[i] = al.get(i);
        }
        return ans;
    }
}
