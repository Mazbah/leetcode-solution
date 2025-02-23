class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> l = new ArrayList<>();

        int n = nums.length;
        for(int i=0;i<n;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }

        int x = n/3;
        for(int j: hm.keySet()){
            if(hm.get(j) > x){
                l.add(j);
            }
        }
        return l;
    }
}