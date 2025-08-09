class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
            if(st.peek() == '*'){
                st.pop();
                st.pop();
            }
        }

        StringBuilder c = new StringBuilder();
        while(!st.isEmpty()){
            c.append(st.pop());
        }
        return c.reverse().toString();
    }
}