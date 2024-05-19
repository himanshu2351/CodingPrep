package top150InterviewQuestions;

//Problem Statement :
//
//There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
//
//You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
//
//Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique
//
// 
//
//Example 1:
//
//Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
//Output: 3

public class GasStation {
	
	public int canCompleteCircuit(int[] gas, int[] cost) {
	    
		///////////////////// Approach 1 /////////////////////////// 
		
        int total = 0, current = 0, start = 0;
        for(int i=0;i<gas.length;i++){
            int gain = gas[i]-cost[i];
            total += gain;
            current += gain;
            if(current<0){
                start = i+1;
                current = 0;
            }
        }

        return total>=0 ? start : -1;
    }
	
		///////////////////// Approach 2 ///////////////////////////
	
    //     for(int i=0;i<gas.length;i++){
    //         gas[i] -= cost[i];
    //     }

    //     int sum = gas[0];
    //     int i= 1;
    //     int start = 0;
    //     while(i<gas.length && i!=start){
    //         if(sum < 0){
    //             if(i<start) return -1;
    //             start = i;
    //             sum = gas[i];
    //         }
    //         else{
    //             sum += gas[i];
    //         }
    //         if(i!=gas.length-1){
    //             i++;
    //         }
    //         else{
    //             if(start == 0){
    //                 i++;
    //             }
    //             else {
    //                 i = (i+1)%gas.length;
    //             }
    //         }
    //     }
    //     if(sum>=0) return start;
    //     return -1;
    // }
}
