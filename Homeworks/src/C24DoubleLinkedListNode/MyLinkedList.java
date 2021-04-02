package C24DoubleLinkedListNode;

import java.util.Objects;

public class MyLinkedList <E>{
    private DoubleLinkedListNode <E> head;
    private DoubleLinkedListNode <E> tail;
    public int size;

    public void add (E element){
        if (head == null && tail == null){
            DoubleLinkedListNode<E> node = new DoubleLinkedListNode<>(element);
            this.head = node;
            this.tail = node;
            this.tail.prev(head);
            this.head.next(tail);
        } else {
            DoubleLinkedListNode<E> node = new DoubleLinkedListNode<>(element);
            this.tail.next(node);
            node.prev(tail);
            this.tail = node;
        }
        this.size += 1;
    }

    public E get (int index){
        if (index > this.size){
            return null;
        }
        DoubleLinkedListNode<E> it = this.head;
        int counter = 0;
        while (counter < 0){
            it = it.next();
            counter++;
        }
        return it.value();
    }

    public E remove (int index){
        if(index > this.size){
            return null;
        }
        this.size -= 1;

        if (index == 0){
            E value = this.head.value();
            this.head.prev(null);
            return value;
        }
        if (index == this.size){
            E value = this.tail.value();
            this.tail = this.tail.prev();
            this.tail.next(null);
            return value;
        }
        DoubleLinkedListNode<E> it = this.head;
        int counter = 1;
        while (counter < index){
            it = it.next();
            counter += 1;
        }
        DoubleLinkedListNode<E> aux = it.next();
        it.next(it.next().next());
        it.next().prev(it);
        return aux.value();
    }


}
