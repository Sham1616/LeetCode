class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> seen=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int complement=target-num;
            if(seen.containsKey(complement)){
                return new int[]{seen.get(complement),i};
            }
            seen.put(num,i);
        }
        return new int[]{-1, -1};
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)