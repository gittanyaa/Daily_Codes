package Leetcode;
public class nextGreaterElements {
    
        public int[] nextGreaterElement(int[] nums) {
            
            int size = nums.length;
            int[] ans = new int [size];
    
            java.util.Stack<Integer> stack = new java.util.Stack<>();
    
            for(int i= 2*size-1;i>= 0;i--){
                while(!stack.isEmpty() && nums[i%size] >= stack.peek()){
                    stack.pop();
                }
    
                if(i<size){
                    if(!stack.isEmpty()){
                        ans[i] = stack.peek();
                    }
                    else{
                        ans[i] = -1;
                    }
                }
                stack.push(nums[i%size]);
            }
            return ans;
        }    }

