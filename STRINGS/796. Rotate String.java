class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String sb=s+s;
        return sb.contains(goal);
    }
}

// Time Complexity: O(n) (substring search with contains)

// Space Complexity: O(n) (for the doubled string)