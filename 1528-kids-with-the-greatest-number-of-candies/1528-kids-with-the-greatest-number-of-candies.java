class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int len = candies.length;
        List<Boolean> list = new LinkedList<>();

        int maxNum = -1;
        for(int i=0;i<len;i++){
            maxNum = Math.max(candies[i], maxNum);
        }
        for(int i=0;i<len;i++){
            if(candies[i]+extraCandies >= maxNum){
                list.add(true);
            }else{
                list.add(false);
            }
        }

        return list;
    }
}