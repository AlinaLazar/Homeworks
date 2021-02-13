package C6Mostenire;

import java.util.*;
public class MyIntArrayList {

    private int[] elements;
    private int size;


    public MyIntArrayList() {
        this(10);
    }

    //public MyIntArrayList(MyIntArrayList c){
    //.....
    //}

    public MyIntArrayList(int initialCapacity) {
        this.elements = new int[initialCapacity];
    }

    public boolean add(int e) {
        if (this.size == this.elements.length) {
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }

        this.elements[size] = e;
        this.size++;

        return true;
    }

    public void add (int index, int element){
        if (this.size == this.elements.length){
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }
        for (int i = size; i >= index; i--) {
            this.elements[i] = this.elements[i - 1];
        }

        elements[index] = element;
        this.size += 1;
    }


    public int size() {
        return this.size;
    }

    public boolean contains(int e) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == e) {
                return true;
            }
        }
        return false;
    }

    public int get(int index) {
        return elements[index];
    }

    public int indexOf(int e) {
        int index = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == e) {
                index = i;
            }
        }
        return index;
    }

    public int lastIndexOf(int e) {
        int index = 0;
        for (int i = elements.length - 1; i >= 0; i--) {
            if (elements[i] == e) {
                index = i;
            }
        }
        return index;
    }

    public boolean remove(int element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element)
                for (int j = i; j < elements.length - 1; j++) {
                    elements[j] = elements[j + 1];
                }

        }
        this.size -= 1;
        return true;
    }

    public int removeElementAtIndex(int index) {
        if (index < 0 || index >= this.size) {
            // should throw IndexOutOfBoundsException
            System.out.println("Throwing IndexOutOfBoundsException when trying to" +
                    " remove element at position " + index);
            return -1;
        }

        int removedElement = this.elements[index];
        for (int i = index; i < this.size; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;

        return removedElement;
    }

    public void clear() {
        this.size = 0;
    }


    public int set(int index, int e) {
        if (index < 0 || index >= this.size) {
            // should throw IndexOutOfBoundsException
            System.out.println("Throwing IndexOutOfBoundsException when trying to set" +
                    " the element " + e + " at position " + index);
            return -1;
        }

        int replacedElement = this.elements[index];
        this.elements[index] = e;
        return replacedElement;
    }


    public boolean addAll(MyIntArrayList addedCollection) {
        if (addedCollection.size == 0) {
            System.out.println("NullPointerException when trying to" + " add null collection ");
            return false;
        }

        if (this.elements.length <= this.size + addedCollection.size) {
            this.elements = Arrays.copyOf(this.elements, this.size + addedCollection.size);
        }

        for (int i = 0; i < addedCollection.size; i++) {
            elements[this.size + i] = addedCollection.get(i);
        }

        this.size += addedCollection.size;
        return true;

    }

    public boolean addAll(int index, MyIntArrayList addedCollection) {
        if (addedCollection.size == 0) {
            System.out.println("NullPointerException when trying to add null collection ");
            return false;
        } else if (index < 0 || index > this.size) {
            System.out.println("Throwing IndexOutOfBoundsException when trying to add element at position " + index);
            return false;
        } else {
            int[] temp = new int[this.size - index];
            for (int i = 0; i < this.size - index; i++) {
                temp[i] = elements[index + i];
            }

            if (this.elements.length <= this.size + addedCollection.size) {
                this.elements = Arrays.copyOf(this.elements, this.size + addedCollection.size);
            }

            for (int i = 0; i < addedCollection.size; i++) {
                elements[index + i] = addedCollection.get(i);
            }

            for (int i = 0; i < temp.length; i++) {
                elements[index + addedCollection.size + i] = temp[i];
            }

            this.size += addedCollection.size;
            return true;

        }
    }

    public int[] toArray() {
        int[] finalArray = new int[this.size];
        for (int i = 0; i < this.size; i++) {
            finalArray[i] = elements[i];
        }
        return finalArray;
    }

    public void ensureCapacity(int minCapacity) {
        if (this.elements.length < minCapacity) {
            this.elements = Arrays.copyOf(this.elements, minCapacity);
        }
    }

    public void trimToSize() {
        this.elements = Arrays.copyOf(this.elements, this.size);
    }
}


