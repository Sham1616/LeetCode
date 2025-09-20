class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0;
        int cnt2=0;
        int el1=0;
        int el2=0;
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(el1==nums[i]){
                cnt1++;
            }else if(el2==nums[i]){
                cnt2++;
            }else if(cnt1==0){
                cnt1++;
                el1=nums[i];
            }else if(cnt2==0){
                cnt2++;
                el2=nums[i];            
            }else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(el1==nums[i]){
                cnt1++;
            }else if(el2==nums[i]){
                cnt2++;
            }
        }if(cnt1>nums.length/3) result.add(el1);
        if(cnt2>nums.length/3) result.add(el2);
        return result;
    }
}


//Complexity

// Time Complexity: O(n) (two passes)
// Space Complexity: O(1)