class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones=0;
        int zeros=0;
        for(int num:nums){
            if(num==1){
                ones++;
                zeros=Math.max(zeros,ones);
            }else if(num==0){
                ones=0;
            }
        }
        return zeros;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)