package Leetcode;

public class removeKdigits {
    
        public String removeKdigit(String num, int k) {
             if (num.length() == k) return "0";
    
            java.util.Stack<Character> stack = new java.util.Stack<>();
            int i = 0;
    
            while (i < num.length()) {
    while (!stack.isEmpty() && k > 0 && ((stack.peek() - '0') > (num.charAt(i) - '0'))) {
                    stack.pop();
                    k--;
                }
                stack.push(num.charAt(i));
                i++;
            }
    
            while (k > 0) {
                stack.pop();
                k--;
            }
    
            StringBuilder ans = new StringBuilder();
    
            while (!stack.isEmpty()) {
                ans.append(stack.pop());
            }
    
            ans.reverse();
    
            while (ans.length() > 1 && ans.charAt(0) == '0') {
                ans.deleteCharAt(0);
            }
    
            return ans.isEmpty() ? "0" : ans.toString();
        }    }

