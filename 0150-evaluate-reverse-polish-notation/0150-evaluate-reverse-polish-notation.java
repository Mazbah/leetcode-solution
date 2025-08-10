class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String s: tokens){
            int result=0;
            if(s.equals("+") || s.equals("-")  || s.equals("*")  || s.equals("/") ){
            	int value1 = st.pop();
                int value2 = st.pop();
                if(s.equals("+") )    result = (value1 + value2);
                else if(s.equals("-") )    result = (value2 - value1);
                else if(s.equals("*") )    result = (value1 * value2);
                else if(s.equals("/") )    result = (value2 / value1);

                st.push(result);
            }else{
                st.push(Integer.parseInt(s));
            }
            
        }

        return st.pop();
    }
}