class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int maxi=Integer.MIN_VALUE;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=maxi){
                ans.add(arr[i]);
            }
            maxi=Math.max(maxi,arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }
}


// Time Complexity	O(n)
// Space Complexity	O(n)