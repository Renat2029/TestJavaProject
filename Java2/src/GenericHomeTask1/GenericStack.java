package GenericHomeTask1;

import java.util.ArrayList;
import java.util.Collection;

public class GenericStack<E> implements Stack<E> {
    public Object[] elements;
    private int capacity; //вместимость
    private int size;

    public GenericStack(int capacity) {
        elements = new Object[capacity];
        this.capacity = capacity;
        size = 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void push(E element) throws StackExeption {
        if (isFull()) {
            throw new StackExeption("Stack overflow");
        }
        System.out.println(element.toString());
        elements[size] = element;
        size = size + 1;
    }


    public E pop() throws StackExeption {
        if (isEmpty()) {
            throw new StackExeption("null size");
        }
        size--;
        @SuppressWarnings("unchecked")
        E o = (E) elements[size];
        System.out.println(elements[size].toString());
        elements[size] = null;
        return o;
    }


    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        E o = (E) elements[size];
        return o;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size <= 0;
    }

    @Override
    public boolean isFull() {
        return size >= capacity;

    }

    @Override
    public void pushAll(Collection src) throws StackExeption {
        if (isFull()) {
            throw new StackExeption("Stack overflow");
        }

        for (Object element : src) {
            push((E) element);
        }

    }

    @Override
    public void popAll(Collection dst) throws StackExeption {
//        while (!isEmpty()) {
//            dst.add(pop());
//        }
        if (isEmpty()) {
            throw new StackExeption("null size");
        }

        for (Object element : dst) {
            pop();
        }

    }
}
