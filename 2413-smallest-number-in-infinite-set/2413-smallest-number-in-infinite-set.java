class SmallestInfiniteSet {

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int minNum;
    public SmallestInfiniteSet() {
        minNum = 1;
    }
    
    public int popSmallest() {
        if(!pq.isEmpty()){
            return pq.poll();
        }
        minNum++;
        return minNum-1;
    }
    
    public void addBack(int num) {
        if(minNum>num && !pq.contains(num)){   
            // minNum>num na hoile toh smallest num show korbe na and !heap.contains(num), set er moto kaj korteche
            pq.add(num);
        }    
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */