class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Set<Integer> s = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            s.add(entry.getValue());
        }

        if(s.size() == hm.size()) return true;
        else return false;
    }
}