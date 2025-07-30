class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length-1;
        // int i=0;
        int count = 0;

        // Two pointer approach
        // Arrays.sort(nums);

        // // while(n>i){
        // //     if(nums[i]+nums[n] == k){
        // //         count++;
        // //         i++;
        // //         n--;
        // //     }else if(nums[i]+nums[n] > k){
        // //         n--;
        // //     }else{
        // //         i++;
        // //     }
        // // }


        // HashMap

        HashMap<Integer, Integer> map = new HashMap<>();
      
        for(int num: nums){
            if(map.containsKey(num) && map.get(num)>0){ // khutechi value tai, key+value = num
                count++;
                map.put(num, map.get(num)-1);
            }else{
                map.put(k-num, map.getOrDefault(k-num,0)+1); // Initially insert kortechi key te k-num
            }
        }

        return count;
    }
}