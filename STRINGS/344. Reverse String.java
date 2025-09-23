class Solution {
    public void reverseString(char[] s) {
        int right=s.length-1;
        int left=0;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            right--;
            left++;
        }
    }
}

// O(n) time and O(1) extra space.