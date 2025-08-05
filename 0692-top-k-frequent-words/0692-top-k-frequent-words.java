class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hm = new HashMap<>();

        for(String s: words){
            hm.put(s, hm.getOrDefault(s, 0)+1);   // add word and count in map
        }

        // Decending and word is lexicographical order e pq build
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
            (a,b) -> {
                if(!a.getValue().equals(b.getValue())){
                    return (b.getValue() - a.getValue());    // Decending order
                }
                else{
                    return a.getKey().compareTo(b.getKey()); // Word assending
                }
        });

        for(Map.Entry<String, Integer> entry: hm.entrySet()){
            pq.add(entry);  // adding in the pq
        }

        List<String> result = new ArrayList<>();

        for(int i=0;i<k;i++){
            Map.Entry<String, Integer> s = pq.poll();
            result.add(s.getKey());
        }

        return result;
    }
}