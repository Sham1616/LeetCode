class Solution {
    public int search(int[] nums, int target) {
        return bs(nums,0,nums.length-1,target);
    }
    private int bs(int[] nums,int low,int high,int target){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]<target){
            return bs(nums,mid+1,high,target);
        }else{
            return bs(nums,low,mid-1,target);
        }
    }
}

// Time Complexity: O(log n)
// Space Complexity: O(log n) (due to recursion stack)