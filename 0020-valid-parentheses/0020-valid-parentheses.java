class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        Boolean x = true;
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '[' ){
                st.push(c);
            }else{
                if(!st.isEmpty()){
                    char ch = st.pop();
                    if(c == ')' && ch == '(' ) continue;
                    else if(c == '}' && ch == '{' ) continue;
                    else if(c == ']' && ch == '[' ) continue;
                    else return false;
                }else{
                    return false;
                }
            }
        }

        if(!st.isEmpty()) return false;

        return x;
    }
}