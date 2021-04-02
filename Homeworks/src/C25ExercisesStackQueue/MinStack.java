package C25ExercisesStackQueue;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    Deque<Integer> stack ;
    Deque<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int val) {
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
        stack.push(val);

    }

    public void pop() {
        int topStack = stack.peek();
        int topMinStack = minStack.peek();
        if (topStack == topMinStack) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
