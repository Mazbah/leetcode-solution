class Solution {
    public int singleNumber(int[] nums) {

        // Bitwise Solution
        // int result = 0;
        // for(int i=0;i<nums.length;i++){
        //     result ^= nums[i];
        // }
        // return result;

        // HashMap Solution
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> it : hm.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        return -1;
    }
}