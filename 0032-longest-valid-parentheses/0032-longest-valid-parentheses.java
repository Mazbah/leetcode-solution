class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();

        int count = 0;
        st.push(-1);   // st.pop() use kore initially jate error na dei, base value set
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                st.push(i);;
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    count = Math.max(count, i-st.peek()); // Stack er last ')' er shate compare
                }
            } 
        }
        
        return count;
    }
}