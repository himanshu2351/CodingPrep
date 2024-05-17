package arrayQuestion;

//Problem statement :
//
//Gary has N coins placed in a straight line. Some coins have head side up, and others have the tail side up.
//
//Convention:
//1 denotes the HEAD side is up. 
//0 denotes the TAIL side is up. 
//Now, Gary wants to obtain a maximum number of head-side up coins. He can perform at most one(possibly 0) flip in which he can flip the coins of a continuous interval (continuous subarray).
//
//For example: In the given array (0 based indexing), { 1, 0, 0, 1, 0, 0, 1 }, we can obtain maximum head side up coins by flipping the coins in range 1 to 5. The array will thus become {1, 1, 1, 0, 1, 1, 1 }.
//Return the maximum number of heads side up Gary can obtain.
//
//Sample input 1:
//1
//4
//1 0 1 0 
//
//Sample output 1:
//3

public class FlippingCoins {
	public static int flippingCoins(int[] arr) {
        //Write your code here
        int n= arr.length;
        int z = 0, o = 0;
        for(int x : arr){
            if(x==0) z++;
            else o++;
        }

        if(z==n || o==n) return n;
        int cur = 0, total = 0;

        for(int i=0;i<n;i++){
            if(arr[i]==0) arr[i] = 1;
            else arr[i] = -1;
        }

        for(int i : arr){
            cur+=i;
            if(cur>total) total = cur;
            if(cur<0) cur = 0;
        }

        if(total<=0) return o;
        return o+total;
    }
}
