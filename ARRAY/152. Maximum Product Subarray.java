class Solution {
    public int maxProduct(int[] nums) {
        int maxim=Integer.MIN_VALUE;
        int pre=1;
        int suff=1;
        for(int i=0;i<nums.length;i++){
            if(pre==0) pre=1;
            if(suff==0) suff=1;

            pre=pre*nums[i];
            suff=suff*nums[nums.length-i-1];
            maxim=Math.max(maxim,Math.max(pre,suff));
            }
        return maxim;
    }
}

// Complexity

// Time: O(n)

// Space: O(1)