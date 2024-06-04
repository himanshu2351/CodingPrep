package top150InterviewQuestions;

//Problem Statement :
//
//You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
//
//Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
//
//Return intervals after the insertion.
//
//Note that you don't need to modify intervals in-place. You can make a new array and return it.
//
//Example 1:
//
//Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
//Output: [[1,5],[6,9]]

import java.util.ArrayList;

public class InsertIntervals {
	public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length == 0){
            int[][] x = new int[1][2];
            x[0] = newInterval;
            return x;
        }
        ArrayList<int[]> al = new ArrayList<>();
        int[] a = newInterval;
        int i = 0;
        while(i<intervals.length){
            int[] interval = intervals[i];
            if(a[1]<interval[0]){
                al.add(a);
                a = interval;
            }
            else if(a[0]>interval[1]){
                al.add(interval);
            }
            else if(a[0]<=interval[1]){
                a[0] = Math.min(a[0],interval[0]);
                a[1] = Math.max(a[1],interval[1]);
            }
            i++;
        }
        al.add(a);
        int[][] ans = new int[al.size()][2];
        for(i=0;i<al.size();i++){
            ans[i] = al.get(i);
        }
        return ans;
    }
}
