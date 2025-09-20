class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
             rev(nums,0,n-1);
             return;
        }
        for(int j=n-1;j>index;j--){
            if(nums[j]>nums[index]){
                int temp=nums[j];
                nums[j]=nums[index];
                nums[index]=temp;
                break;
            }
        }
        rev(nums,index+1,n-1);
    }
    private void rev(int[] arr,int left,int right){
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)