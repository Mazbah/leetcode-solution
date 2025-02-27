class Solution {
    public int maxProduct(int[] nums) {
        int product= nums[0];
        int n = nums.length;
        // Brute Force
        // for(int i=0;i<n;i++){
        //     int x = nums[i];
        //     for(int j=i+1;j<n;j++){
        //          x *= nums[j];
        //         if(x>0) product = Math.max(product,x);
        //         else    product = Math.max(product, nums[j]);
        //     }
        // }

        // Observation based
        
        int suffix=1;
        int prefix=1;

        for(int i=0;i<n;i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix *= nums[i];
            suffix *= nums[n-i-1];

            product = Math.max(product, Math.max(prefix, suffix));
        }

        return product;
    }
}