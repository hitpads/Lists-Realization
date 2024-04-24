import java.util.Iterator;
import java.util.LinkedList;
import java.util.EmptyStackException;

public class LinkedListStack<T> implements ListForStack<T>, Iterable<T> {

    private LinkedList<T> linkedList;

    LinkedListStack() {
        linkedList = new LinkedList<>();
    }

    @Override
    public void push(T element) {
        linkedList.addFirst(element); // Adds the specified element at the beginning of the linked list
    }

    @Override
    public T pop() {
        if (isEmpty()) { // If stack is empty
            throw new EmptyStackException(); // Throw EmptyStackException
        }
        return linkedList.removeFirst(); // Removes and returns the first element in the linked list
    }

    @Override
    public T peek() {
        if (isEmpty()) { // If stack is empty
            throw new EmptyStackException(); // Throw EmptyStackException
        }
        return linkedList.getFirst(); // Returns the first element in the linked list
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty(); 
    }

    @Override
    public int size() {
        return linkedList.size();
    }

    @Override
    public Iterator<T> iterator() {
        return linkedList.iterator();
    }
}