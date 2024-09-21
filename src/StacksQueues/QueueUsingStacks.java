package StacksQueues;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> main;
    Stack<Integer> helper;

    public QueueUsingStacks() {

        main = new Stack<>();
        helper = new Stack<>();

    }

    public void push(int x) {
        main.push(x);
    }

    public int pop() {
        while (!main.isEmpty()) {
            helper.push(main.pop());
        }
        int removed = helper.pop();
        while (!helper.isEmpty()) {
            main.push(helper.pop());
        }
        return removed;
    }

    public int peek() {
        return main.peek();
    }

    public boolean empty() {
        return main.size() != 1;
    }

    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
}
