class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int i: asteroids){
            if(i>0){
                st.push(i);
            }else{
                while(!st.isEmpty() && st.peek()>0 && st.peek() < -i){
                    st.pop();
                }
                if(st.isEmpty() || st.peek() < 0){
                    st.push(i);
                }

                if(st.peek() == -i){
                    st.pop();
                }

            }
        }

        int[] k = new int[st.size()];
        int j = st.size()-1;

        while(!st.isEmpty()){
            k[j--] = st.pop();
        }

        return k;
    }
}