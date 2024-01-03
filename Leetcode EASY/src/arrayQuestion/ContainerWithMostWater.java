package arrayQuestion;

//Problem statement
//Given a sequence of ‘N’ space-separated non-negative integers A[1],A[2],A[3],......A[i]…...A[n]. Where each number of the sequence represents the height of the line drawn at point 'i'. Hence on the cartesian plane, each line is drawn from coordinate ('i',0) to coordinate ('i', 'A[i]'), here ‘i’ ranges from 1 to ‘N’. Find two lines, which, together with the x-axis forms a container, such that the container contains the most area of water.
//
//Note :
//1. You can not slant the container i.e. the height of the water is equal to the minimum height of the two lines which define the container.
//
//2. Do not print anything, you just need to return the area of the container with maximum water.
//
//Sample Input 1 :
//2
//5
//4 3 2 1 4
//3
//1 2 1
//
//Sample Output 1 :
//16
//2 

public class ContainerWithMostWater {
	public static int maxArea(int[] height) {
	    // Write your code here
		int maxArea = 0;
		int s = 0;
		int e = height.length-1;
		while(s<e){
			int area = (e-s)*(Math.min(height[s], height[e]));
			if(maxArea<area){
				maxArea = area;
			}
			if(height[s]>height[e]){
				e--;
			}
			else{
				s++;
			}
		}

		return maxArea;
		
	}
}
