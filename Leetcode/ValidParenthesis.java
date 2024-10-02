package Leetcode;

public class ValidParenthesis {
    java.util.Stack<Character> st = new java.util.Stack<>();   
     public boolean isValid(String s) {
       

        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(')');
            }
            else if(c == '{'){
                st.push('}');
            }
            else if(c =='['){
                st.push(']');
            }
            else if(st.isEmpty() || st.pop()!=c){
                return false;
            }
        }
        return st.isEmpty();
    }
}
