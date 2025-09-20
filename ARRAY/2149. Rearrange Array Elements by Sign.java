class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] neg=new int[n/2];
        int[] pos=new int[n/2];
        int countneg=0;
        int countpos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg[countneg]=nums[i];
                countneg++;
            }else{
                pos[countpos]=nums[i];
                countpos++;
            }
            }
        for(int j=0;j<n/2;j++){
            nums[2*j]=pos[j];
            nums[2*j+1]=neg[j];
        }
        return nums;
        }
    }

//     Time Complexity: O(n)
// Space Complexity: O(n)