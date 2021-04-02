package C25ExercisesStackQueue;

import java.util.Deque;
import java.util.LinkedList;

public class ImplementQueueUsingStacks {
    Deque<Integer> stack;
    Deque<Integer> auxStack;

    public ImplementQueueUsingStacks() {
        stack = new LinkedList<>();
        auxStack = new LinkedList<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        while(stack.size() != 1){
            auxStack.add(stack.pop());
        }
        while(auxStack.size() != 0){
            stack.add(auxStack.pop());
        }
        return stack.pop();
    }

    public int peek() {
        while(stack.size() != 1){
            auxStack.add(stack.pop());
        }
        while(auxStack.size() != 0){
            stack.add(auxStack.pop());
        }
        int result = stack.pop();
        stack.add(result);
        return result;
    }

    public boolean empty() {
        return stack.isEmpty();
    }

}
