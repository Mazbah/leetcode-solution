class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length-1;
        int i=0;
        int count = 0;
        Arrays.sort(nums);

        while(n>i){
            if(nums[i]+nums[n] == k){
                count++;
                i++;
                n--;
            }else if(nums[i]+nums[n] > k){
                n--;
            }else{
                i++;
            }
        }

        // HashMap<Integer, Integer> map = new HashMap<>();
        // int count = 0;
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i], k-nums[i]);
        // }

        // for(int i=0;i<nums.length;i++){
        //     int x = k-nums[i];
        //     if(map.containsKey(x) && map.get(x)>0){
        //         count++;
        //         map.put(x, map.get(x))
        //     }
        // }

        return count;
    }
}