class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int fir=firstbs(nums,n,target);
        if(fir==-1) {return new int[]{-1,-1};}
        int las=lastbs(nums,n,target);
        return new int[]{fir,las};
    }
        private int firstbs(int[] nums,int n,int target){
        int first=-1;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return first;
        }
        private int lastbs(int[] nums,int n,int target){
        int last=-1;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return last;
        }
}


// Time Complexity: O(log n)
// Space Complexity: O(1)