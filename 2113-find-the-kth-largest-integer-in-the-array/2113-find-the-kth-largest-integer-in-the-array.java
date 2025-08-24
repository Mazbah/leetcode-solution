import java.math.BigInteger;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> pq = new PriorityQueue<>();

        int len = nums.length;
        for(int i=0;i<len;i++){
            pq.offer(new BigInteger(nums[i]));
        }

        int n = len-k+1;

        for(int i=0;i<n-1;i++) pq.poll();

        return pq.peek().toString();
    }
}