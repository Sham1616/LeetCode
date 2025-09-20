class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for (int i=0;i<numRows;i++){
            List<Integer> res=new ArrayList<>();
            int sum=1;
            for(int j=0;j<=i;j++){
                res.add(sum);
                sum=sum*(i-j);
                sum=sum/(j+1);
            }
            ans.add(res);
        }
        return ans;
    }
}

// Complexity

// Time: O(numRows²) → nested loop building triangle.

// Space: O(numRows²) → storing result.