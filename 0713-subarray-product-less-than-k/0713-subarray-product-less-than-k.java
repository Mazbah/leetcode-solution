class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int n= nums.length;
        int count = 0;
        int product = 1;
        int left = 0, right = 0;

        while(right<n){
            product *= nums[right];
            while(product >= k){
                product /= nums[left++];
            }
            count += 1+(right-left);
            right++;
        }
        return count;
    }
}