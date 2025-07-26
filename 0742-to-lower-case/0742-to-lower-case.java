class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder(s.length());

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                result.append((char) (ch+32));
            }else{
                result.append(ch);
            }
        }

        return result.toString();
    }
}