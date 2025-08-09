class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        // for(int i=0;i<s.length();i++){
        //     st.push(s.charAt(i));
        //     if(st.peek() == '*'){
        //         st.pop();
        //         st.pop();
        //     }
        // }

        for(char c: s.toCharArray()){
            if(c == '*'){
                st.pop();
            }else{
                st.push(c);
            }
        }

        StringBuilder c = new StringBuilder();
        while(!st.isEmpty()){
            c.append(st.pop());
        }
        return c.reverse().toString();
    }
}