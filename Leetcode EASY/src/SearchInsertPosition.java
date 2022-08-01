//0035 - Search Insert Position

//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n) runtime complexity.
//
// 
//
//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:
//
//Input: nums = [1,3,5,6], target = 7
//Output: 4
// 
//
//Constraints:
//
//1 <= nums.length <= 104
//-104 <= nums[i] <= 104
//nums contains distinct values sorted in ascending order.
//-104 <= target <= 104
//
//
//Time Complexity - O(n)
//Space Complexity - O(n)

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        
        int x = binarySearch(nums,l,h,target);
        return x;
    }
    
    public int binarySearch(int[] nums, int l, int h, int t){
        if(l>h){
            return l;
        }
        else{
            
            int mid = (l+h)/2;
            if(nums[mid]==t){
                return mid;
            }
            else if(nums[mid]<t){
                
                return binarySearch(nums,mid+1,h,t);
            }
            else{
                return binarySearch(nums,l,mid-1,t);
            }
        }
}
