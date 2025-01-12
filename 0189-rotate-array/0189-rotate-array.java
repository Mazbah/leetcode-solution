class Solution {
    public void rotate(int[] nums, int k) {

        // Brute force -- time-0(n+d) ,, space-O(n) - jeheto extra ekta array newa hoiche

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


        // Better approach

        // int d = k%n;
        // reverse(nums, 0, n-1); 
        // reverse(nums, 0, d-1); 
        // reverse(nums, d, n-1);
    }

    // public void reverse(int[] nums, int start, int end){
    //     while(start < end){
    //         int temp = nums[start];
    //         nums[start] = nums[end];
    //         nums[end] = temp;

    //         start++;
    //         end--;
    //     }  
    // }
}