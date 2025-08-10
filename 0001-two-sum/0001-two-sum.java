class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Optimal Sol
        
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // int[] b = new int[2];
        // for(int i=0;i<nums.length;i++){
        //     int diff = target-nums[i];
        //     if(hm.containsKey(nums[i])){
        //         b[0] = hm.get(nums[i]);
        //         b[1] = i;
        //     }
        //     hm.put(diff,i);
        // }

        // // Brute force sol

        // // int[] b = new int[2];
        // // for(int i=0;i<nums.length;i++){
        // //     for(int j=i+1;j<nums.length;j++){
        // //         if(nums[i]+ nums[j] == target){
        // //             b[0] = i;
        // //             b[1] = j;
        // //         }
        // //     }
        // // }
        // return b;

        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] x = new int[2];

        int j = nums.length;
        for(int i=0;i<j;i++){
            int x1  = target - nums[i];
            if(hm.containsKey(nums[i])){
                x[0] = hm.get(nums[i]);
                x[1] = i;
            }
            hm.put(x1, i);
        }

        return x;
    }
}