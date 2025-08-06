class Solution {
    public int longestSubarray(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                list.add(count);
                count = 0;
            }else{
                count++;
            }
        }
        list.add(count);

        if(list.size() > 1){
            int sum = 0;
            for(int i=1;i<list.size();i++){
                sum = Math.max(sum, list.get(i-1)+list.get(i));
            }
            return sum;
        }else{
            return nums.length-1;
        }
        
    }
}