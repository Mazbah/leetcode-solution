class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> st = new Stack<>();

        for(String com: parts){
            if(com.equals("") || com.equals(".")){
                continue;
            }

            if(com.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(com);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.insert(0, "/" + st.pop());  // Always first ei add hoite thakbe
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}