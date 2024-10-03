package GFG;
import java.util.ArrayList;
import java.util.Stack;

// Assuming the Node class is defined somewhere else in your codebase
class Node {
     int data;
     Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
 }

public class Iterative_inorder {
    
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node current = root;
        
        while (current != null || !stack.isEmpty()) {
            // Traverse to the leftmost node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            
            // Current must be null at this point
            current = stack.pop();
            result.add(current.data);
            
            // Move to the right subtree
            current = current.right;
        }
        
        return result;
    }
}
