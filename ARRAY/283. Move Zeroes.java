class Solution {
    public void moveZeroes(int[] nums) {
       int k=0;
       int temp;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            if(i!=k){
        temp=nums[i];
        nums[i]=nums[k];
        nums[k]=temp;
            }
        k++;
        }
       }
    }
}   

// Time Complexity: O(n)
// Space Complexity: O(1)