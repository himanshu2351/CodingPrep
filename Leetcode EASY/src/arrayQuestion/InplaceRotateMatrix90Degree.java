package arrayQuestion;

//Problem statement :
//	
//You are given a square matrix of non-negative integers of size 'N x N'. Your task is to rotate that array by 90 degrees in an anti-clockwise direction without using any extra space.
//
//For example:
//
//For given 2D array :
//
//    [    [ 1,  2,  3 ],
//         [ 4,  5,  6 ],
//         [ 7,  8,  9 ]  ]
//
//After 90 degree rotation in anti clockwise direction, it will become:
//
//    [   [ 3,  6,  9 ],
//        [ 2,  5,  8 ],
//        [ 1,  4,  7 ]   ]

public class InplaceRotateMatrix90Degree {
	public static void inplaceRotate(int[][] arr, int n) {
		// Write your code here.
		int m = n%2 == 0 ? n/2 : (n/2)+1;
		for(int i=0;i<m;i++){
			for(int j=i;j<n-i-1;j++){
				int x = n-j-1;
				int y = i;
				int t = arr[i][j];
				while(!(x==i && y==j)){
					int t1 = arr[x][y];
					arr[x][y] = t;
					t = t1;
					int x1 = x;
					x = n-y-1;
					y = x1;
				}
				arr[i][j] = t;
			}
		}

	}
}
