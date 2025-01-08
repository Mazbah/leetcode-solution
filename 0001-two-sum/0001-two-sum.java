class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Optimal Sol
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] b = new int[2];
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(hm.containsKey(nums[i])){
                b[0] = hm.get(nums[i]);
                b[1] = i;
            }
            hm.put(diff,i);
        }

        // Brute force sol

        // int[] b = new int[2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+ nums[j] == target){
        //             b[0] = i;
        //             b[1] = j;
        //         }
        //     }
        // }
        return b;
    }
}