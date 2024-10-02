package GFG;

public class ReverseK_queue {
    // User function Template for Java

  
        // Function to reverse first k elements of a queue.
        public java.util.Queue<Integer> modifyQueue(java.util.Queue<Integer> q, int k) {
            // add code here.
            if(q == null || k<=0 || k>q.size()){
                return q;
            }
            
            java.util.Stack<Integer> st = new java.util.Stack<>();
            
            for(int i=0;i<k;i++){
                st.push(q.poll());
            }
            
            while(!st.isEmpty()){
                q.add(st.pop());
            }
            
            int remainingElement = q.size()-k;
            for(int i=0;i<remainingElement;i++){
                q.add(q.poll());
            }
            
            return q;
        }
    }


