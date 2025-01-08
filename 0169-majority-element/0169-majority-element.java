class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();

        int n = nums.length;
        int maxCount = 0;
        int maxValue = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            m.put(nums[i], m.getOrDefault(nums[i], 0)+1);
            int x = m.get(nums[i]);
            if(x>maxCount){
                maxCount = x;
                maxValue = nums[i];
            }
        }

        return maxValue;
    }
}