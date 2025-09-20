class Solution {
    public int maxProfit(int[] prices) {
        int j=0;
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[j]>prices[i]){
                j=i;
            }
            else{
                maxprofit=Math.max(maxprofit,prices[i]-prices[j]);
            }
        }
        return maxprofit;
    }
}   


// Time Complexity: O(n)
// Space Complexity: O(1)