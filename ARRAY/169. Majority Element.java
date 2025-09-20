class Solution {
    public int majorityElement(int[] nums) {
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(a==0){
                a++;
                b=nums[i];
            }
            else if(b==nums[i]){
                a++;
            }
            else{
                a--;
            }
        }
        int c=0;
        for(int num:nums){
            if(num==b){
                c++;
            }
        }
        if(c>nums.length/2){
           return b;
        }
        return -1;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)