package arrayQuestion;

//Problem Statement :
//
//A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
//
//For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
//The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).
//
//For example, the next permutation of arr = [1,2,3] is [1,3,2].
//Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
//While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
//Given an array of integers nums, find the next permutation of nums.
//
//The replacement must be in place and use only constant extra memory.
//
//Example 1:
//
//Input: nums = [1,2,3]
//Output: [1,3,2]

public class NextPermutation {
	public void nextPermutation(int[] nums) {
        if(nums.length == 1){
            return;
        }
        int val1 = -1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                val1 = i;
            }
        }

        if(val1==-1){
            int val2 = nums.length-1;
            val1 = 0;
            while(val1<val2){
                int t= nums[val1];
                nums[val1++] = nums[val2];
                nums[val2--] = t;
            }
            return;
        }
        int val2 = val1;
        for(int i=val1;i<nums.length;i++){
            if(nums[i]>nums[val1-1] && nums[i]<nums[val2]){
                val2 = i;
            }
        }
        int t= nums[val2];
        nums[val2] = nums[val1-1];
        nums[val1-1] = t;
        sort(nums,val1,nums.length-1);
        return;
    }
	
    public void sort(int[] nums, int a, int b){
        for(int i=a; i<b; i++){
            for(int j=i+1;j<=b;j++){
                if(nums[i]>nums[j]){
                    int t=nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                }
            }
        }
    }
}
