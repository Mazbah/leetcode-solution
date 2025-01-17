class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int maxV = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                maxCount++;
                maxV = Math.max(maxV, maxCount);
            }else{
                maxCount = 0;
            }
        }
        return maxV;
    }
}