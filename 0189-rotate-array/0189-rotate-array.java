class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int diff = n-(k%n)-1;
        int a[] = new int[n];
        int j=0;
        for(int i=diff;i>=0;i--){
           a[j] = nums[i];
           j++; 
        }
        for(int i=n-1;i>diff;i--){
           a[j] = nums[i];
           j++; 
        }
        int x=n-1;
        for(int i=0;i<n;i++){
            nums[i] = a[x];
            x--;
        }
        
    }
}