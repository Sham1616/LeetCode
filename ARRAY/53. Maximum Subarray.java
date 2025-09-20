//Kadane's Algorithm 


class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int currmax=nums[0];
        for(int i=1;i<nums.length;i++){
            maxsum=Math.max(nums[i],maxsum+nums[i]);
            currmax=Math.max(maxsum,currmax);
        }
        return currmax;
    }
}


class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int currmax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum>currmax){
                currmax=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return currmax;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)