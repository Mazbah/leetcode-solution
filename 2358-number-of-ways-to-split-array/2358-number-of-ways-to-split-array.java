class Solution {
    public int waysToSplitArray(int[] nums) {
        long sumTotal = 0;
        long sumC =0;
        for(int i=0;i<nums.length;i++){
            sumTotal += nums[i];
        }
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            sumC += nums[i];

            if(sumC >= (sumTotal-sumC)){
                count++;
            }
        }

        return count;
    }
}