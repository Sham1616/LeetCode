class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] maps=new int[256];
        int[] mapt=new int[256];
        for(int i=0;i<s.length();i++){
            char cs=s.charAt(i);
            char ct=t.charAt(i);
            if(maps[cs]==0 && mapt[ct]==0){
                maps[cs]=ct;
                mapt[ct]=cs;
            }else{
                if(maps[cs]!=ct || mapt[ct]!=cs) return false;
            }
        }
        return true;
    }
}

// Time Complexity: O(n) → iterate strings once.

// Space Complexity: O(1) → fixed size arrays (256 elements).