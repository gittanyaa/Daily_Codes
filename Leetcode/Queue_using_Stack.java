package Leetcode;
import java.util.Stack;

class MyQueue {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public MyQueue() {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }
    
    // Pushes element x to the back of the queue
    public void push(int x) {
        stackPush.push(x);
    }
    
    // Removes the element from the front of the queue and returns it
    public int pop() {
        if (stackPop.isEmpty()) {
            transferElements();
        }
        return stackPop.pop();
    }
    
    // Returns the element at the front of the queue
    public int peek() {
        if (stackPop.isEmpty()) {
            transferElements();
        }
        return stackPop.peek();
    }
    
    // Returns true if the queue is empty, false otherwise
    public boolean empty() {
        return stackPush.isEmpty() && stackPop.isEmpty();
    }
    
    // Helper method to transfer elements from stackPush to stackPop
    private void transferElements() {
        while (!stackPush.isEmpty()) {
            stackPop.push(stackPush.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */


