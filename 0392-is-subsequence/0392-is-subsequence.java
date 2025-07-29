class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = t.length();
        int m = s.length();
        int j=0, x=0;

        if(m < 1) return true; 
        for(int i=0;i<n;i++){
            if(s.charAt(j) == t.charAt(i)){
                x++;
                j++;
            }

            if(x == m) return true;
        }

        return false;
    }
}