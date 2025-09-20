class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" +");
        StringBuilder sb= new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

// Time Complexity: O(n) – where n is the length of the string s
// Space Complexity: O(n) – for the array of words and the StringBuilder