package C23StackQueue;


import java.util.Deque;
import java.util.LinkedList;

public class MinStack{
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack(){
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push (int value){
        if (minStack.isEmpty() || minStack.peek() >= value){
            minStack.push(value);
        }
        stack.push(value);
    }

    public void pop (){
        int topMinStack = minStack.peek();
        int topStack = stack.peek();
        if (topStack == topStack){
            minStack.pop();
        }
        stack.pop();
    }

    public int getMinim(){
        return minStack.peek();
    }

    public int top() {
        return stack.peek();
    }


    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public static void main(String[] args) {

    }

}
