class Solution {
    public int subarraySum(int[] nums, int t) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int remove=sum-t;
            if (map.containsKey(remove)) {
                count+=map.get(remove);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}

// Complexity Analysis

// Time Complexity: O(n) → single pass through the array, with O(1) average-time HashMap operations.

// Space Complexity: O(n)