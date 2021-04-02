package C24DoubleLinkedListNode;

import java.util.LinkedList;

public class MyStack<E> {

    MyLinkedList<E> container;

    public MyStack(){
        this.container = new MyLinkedList<>();
    }

    public void push (E element){
        this.container.add(element);
    }

    public E pop(){
        return this.container.remove(this.container.size - 1);
    }

    public E peek(){
        return this.container.get(this.container.size - 1);
    }

}
