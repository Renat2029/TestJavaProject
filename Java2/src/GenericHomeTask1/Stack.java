package GenericHomeTask1;

import java.util.Collection;

public interface Stack<E> {
    // add new element to the top of the stack
    public void push(E element) throws StackExeption;

    // return and remove an element from the top
    public E pop() throws StackExeption;

    // return the top element but doesn’t remove
    public E peek();

    public int getSize();

    public boolean isEmpty();

    public boolean isFull();

    // add all elements from @src to the stack
    public void pushAll(Collection<? extends E> src) throws
            StackExeption;

    // pop all elements from stack to @dst
    public void popAll(Collection<? super E> dst) throws
            StackExeption;
}