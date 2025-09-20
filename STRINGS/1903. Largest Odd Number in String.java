class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)- '0')%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}

// Time Complexity: O(n) – where n is the length of num
// Space Complexity: O(1) (excluding the output string)