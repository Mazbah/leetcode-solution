class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  
        // // MaxHead -- largest first

        // for(int i=0;i<nums.length;i++){
        //     pq.add(nums[i]);
        // }

        // for(int i=0;i<k-1;i++){
        //     pq.poll();   // remove one by one element by removing the element
        // }

        // return pq.peek();  // peek() - shows the top element

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }

        int res = -1;
        for(int i=0;i<k;i++){
            res = pq.poll(); 
        }

        return res;
    }
}