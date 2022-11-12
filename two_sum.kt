class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        val new_map = mutableMapOf<Int , Int>();

        for(i in nums.indices){
            val d: Int = target-nums[i];
            if(new_map.containsKey(d)){
                return intArrayOf(new_map[d]?:0, i)
            }
            new_map[nums[i]] = i;
        }
        return intArrayOf()    
    }
}