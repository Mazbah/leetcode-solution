class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        int j=0;
        for(int i=1;i<k;i++){
           if(nums[i]!= nums[j]){ // value na mille j er value barteche na mane ekta korei value add hoi
                j++;
                nums[j] = nums[i];
           }
        }

        return j+1;
    }
}