class Solution {
    public boolean isPalindrome(String s) {
         String s1 = s.replaceAll("[^A-Za-z0-9]","").toLowerCase(); //removes other char rather than A-Za-z0-9
         int i=0;
         int j=s1.length()-1;
         int x =0;
         while(i<=j){
             if(s1.charAt(i)!=s1.charAt(j)){
                x=1;
                break;
             }
             i++;
             j--;
         }
         if(x==1) return false;

         return true;
    }
}