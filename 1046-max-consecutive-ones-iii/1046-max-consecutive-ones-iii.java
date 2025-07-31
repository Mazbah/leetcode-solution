class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r=0;
        while(r<nums.length) {
            if (nums[r] == 0) k--; // 0 hoile e k--;
            
            if (k < 0){
                if(nums[l]==0){  // 1st baad dewar 0 ta paile left e value 1 hbe,k++ hbe
                    k++;
                }
                l++;            // left koi giye thamteche eita measure kora
            }
            r++;           // right window always bartei thakbe 
        }
        return r-l;
    }
}