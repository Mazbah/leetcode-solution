class Solution {
    public int[] rearrangeArray(int[] nums) {
        int x=0;
        int y=1;
        int n = nums.length;
        int p[] = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i] >= 0){
                p[x] = nums[i];
                x += 2;
            }else{
                p[y] = nums[i];
                y += 2;
            }
        }
        return p;
    }
}