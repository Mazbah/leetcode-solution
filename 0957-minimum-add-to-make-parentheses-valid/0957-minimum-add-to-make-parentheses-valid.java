class Solution {
    public int minAddToMakeValid(String s) {
        
        // Stack<Character> st = new Stack<>();
        // st.push('p');

        // for(int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);
        //     if(ch == ')'){
        //         if(st.peek() == '('){
        //             st.pop();
        //         }else{
        //             st.push(ch);
        //         }
        //     }else{
        //         st.push(ch);
        //     }
        // }
        // return st.size()-1;

        int opening =0, closing = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                opening++;
            }else if(ch == ')' && opening>0){
                opening--;
            }else{
                closing++;
            }
        }

        return opening+closing;
    }
}