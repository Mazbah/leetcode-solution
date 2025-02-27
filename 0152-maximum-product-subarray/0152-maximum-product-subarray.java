class Solution {
    public int maxProduct(int[] nums) {
        int product= nums[0];
        int n = nums.length;
        for(int i=0;i<n;i++){
            int x = nums[i];
            for(int j=i+1;j<n;j++){
                 x *= nums[j];
                if(x>0) product = Math.max(product,x);
                else    product = Math.max(product, nums[j]);
            }
        }
        return product;
    }
}