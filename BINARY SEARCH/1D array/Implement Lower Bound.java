class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int low=0;
        int high=arr.length-1;
        int lb=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                lb=mid;
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }
        }
        return lb;
    }
}
// Time Complexity: O(log n)
// Space Complexity: O(1)