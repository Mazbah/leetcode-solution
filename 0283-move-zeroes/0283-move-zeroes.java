class Solution {
    public void moveZeroes(int[] nums) {

        // First positive sob gola k diye define kore baki gola te 0 insert kore dilam
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
        }
        for(int i=k;i<nums.length;i++){
            nums[i] = 0;
        }

    }
}