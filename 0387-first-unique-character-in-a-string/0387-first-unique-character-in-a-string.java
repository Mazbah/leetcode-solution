class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char m = s.charAt(i);
            hm.put(m, hm.getOrDefault(m, 0)+1);
        }

        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}