class Solution {
    public String decodeString(String s) {
        // Stack<Integer> numSt = new Stack<>();
        // Stack<StringBuilder> charSt = new Stack<>();
        
        // StringBuilder sb = new StringBuilder();

        // int num = 0;
        // for(char ch: s.toCharArray()){

        //     if(Character.isDigit(ch)){
        //         num = num*10 + (ch-'0');
        //     }else if(ch == '['){    
        //         numSt.push(num);
        //         num = 0;
        //         charSt.push(sb);   // '[' asle always eitar agher value sb te add
        //         sb = new StringBuilder();
        //     }else if(ch == ']'){ 
        //         int k = numSt.pop();
        //         StringBuilder temp = sb;   //current temp sb;
        //         sb = charSt.pop();  // agher stach theke value ene eitar shate add
        //         for(int i=0;i<k;i++){
        //             sb.append(temp);
        //         }
        //     }
        //     else{
        //         sb.append(ch);
        //     }          
        // }

        // return sb.toString();    

        Stack<Integer> numSt = new Stack<>();
        Stack<StringBuilder> charSt = new Stack<>();

        StringBuilder sb = new StringBuilder();

        int num = 0;
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                num = num*10 + (c-'0');
            }else{
                if(c == '['){
                    numSt.push(num);
                    num = 0;
                    charSt.push(sb);
                    sb = new StringBuilder();
                }else if(c == ']'){
                    int k = numSt.pop();
                    StringBuilder temp = sb;
                    sb = charSt.pop();
                    for(int i=0;i<k;i++){
                        sb.append(temp);
                    }
                }else{
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}