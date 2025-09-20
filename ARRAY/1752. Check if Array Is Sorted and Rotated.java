class Solution {
    public boolean check(int[] nums) {
        int drop=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                drop+=1;
            }
        }
        return drop<=1;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)