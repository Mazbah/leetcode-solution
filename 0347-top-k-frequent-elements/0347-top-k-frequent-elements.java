class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int n: nums){
            hm.put(n, hm.getOrDefault(n,0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> Integer.compare(b.getValue(), a.getValue()));

        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            pq.add(entry);
            // if(pq.size()>k){
            //     pq.poll();
            // }
        }

        List<Integer> result = new ArrayList<>(); 
        while (!pq.isEmpty()) {
            Map.Entry<Integer, Integer> mp = pq.poll();  //jeheto map use korchi sob jaigai so map access korte hoile always Map.Entry<Integer, Integer> use korte hbe like int[]
            result.add(mp.getKey());
        }

        int[] valid = new int[k];
        for(int i=0;i<k;i++){
            valid[i] = result.get(i);
        }

        return valid;
    }
}