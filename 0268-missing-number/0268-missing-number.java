class Solution {
    public int missingNumber(int[] nums) {

        // Time Complexity Huge 
        // Arrays.sort(nums);
        // int x=-1;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] != i){
        //         x = i;
        //         break;
        //     } 
        // }
        // if(x==-1){
        //     x = nums.length;
        // }

        int sumTotal = 0;
        int sumNums = 0;

        for(int i=0;i<=nums.length;i++){
            sumTotal +=i;
        }

        for(int i=0;i<nums.length;i++){
            sumNums +=nums[i];
        }
        return sumTotal-sumNums;
    }
}