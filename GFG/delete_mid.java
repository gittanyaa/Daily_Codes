package GFG;
import java.util.*;

public class delete_mid {
    public void deleteMid(java.util.Stack<Integer> s, int sizeOfStack) {
        // code here

        int mid = (sizeOfStack / 2) + 1;
        deleteMiddleHelper(s, mid);
    }



    private void deleteMiddleHelper(Stack<Integer> s, int k) {
        // Base case: if k is 1, remove the middle element
        if (k == 1) {
            s.pop();
            return;
        }

        // Remove the top element
        int top = s.pop();

        // Recursive call to reach the middle element
        deleteMiddleHelper(s, k - 1);

        // Push the top element back after removing the middle element
        s.push(top);}
}
