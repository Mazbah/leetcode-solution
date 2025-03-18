class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(String a: s.trim().split(" ")){
            if(!a.isEmpty()){
                st.push(a);  /// push every splited string into stack
            }
        }

        while(!st.isEmpty()){
            sb.append(st.pop());  // Lifo - add stack elem to sb
            sb.append(" ");
        }

        return sb.toString().trim(); // trim removes whitespaces from both sides of sb
    }
}