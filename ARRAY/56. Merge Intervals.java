class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(res.isEmpty() || arr[i][0]>res.get(res.size()-1)[1]){
                res.add(arr[i]);
            }else{
                res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],arr[i][1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}


// Tmie : O(N log N)

// Space : O(N)