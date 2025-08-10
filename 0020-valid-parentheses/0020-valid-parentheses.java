class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        Boolean x = false;
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '[' ){
                st.push(c);
            }else{
                if(!st.isEmpty()){
                    char ch = st.pop();
                    if(c == ')' && ch == '(' ){
                        x = true;
                    }else if(c == '}' && ch == '{' ){
                        x = true;
                    }else if(c == ']' && ch == '[' ){
                        x = true;
                    }else{
                        x = false;
                        break;
                    }
                }else{
                    x = false;
                    break;
                }
            }
        }

        if(!st.isEmpty()) return false;

        return x;
    }
}