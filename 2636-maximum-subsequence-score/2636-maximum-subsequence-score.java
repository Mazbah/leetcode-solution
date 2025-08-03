class Solution {
    record Pair(int first, int second){}   // Need to initialize the Pair 
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;

        Pair[] pairs = new Pair[n];

        for(int i=0;i<n;i++){
            pairs[i] = new Pair(nums1[i], nums2[i]);
        }

        // Sort by second value (ascending)
        Arrays.sort(pairs, (b, a) -> Integer.compare(a.second, b.second));  // sort the pair based on the second value(nums2) in desending order

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum=0, result=0;

        for(int i=0;i<n;i++){
            int x = pairs[i].first;
            sum += x;
            pq.add(x);   // Heap e just nums1(first) value ta insert korbo

            if(pq.size()>k){
                sum -= pq.poll();   // K theke beshi hoile heap theke nums1 er minimum val remove
            }

            if(pq.size()==k){
                result = Math.max(result, sum*pairs[i].second); // pairs[i].second= last nums2, eita correct because nums2 decending order e so last value ta minimun e eikhane
            }
        }

        return result;

    }
}

// nums1 = [1,3,3,2], 