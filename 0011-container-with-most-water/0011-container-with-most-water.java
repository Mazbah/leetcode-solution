class Solution {
    public int maxArea(int[] height) {
        int n=height.length-1;
        int i=0;
        int sum=0;
        
        while(n>i){
            if(height[i]>height[n]){
                sum =  Math.max(sum, (n-i)*height[n]);
                n--;
            }else{
                sum =  Math.max(sum, (n-i)*height[i]);
                i++;
            }  
        }

        return sum;
    }
}