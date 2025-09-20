class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int low=0;
        int high=arr.length-1;
        int ub=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ub=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ub;
    }
}

// Time Complexity: O(log n)
// Space Complexity: O(1)