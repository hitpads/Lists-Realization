import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListQueue<T> implements ListForQueue<T>, Iterable<T> {
    private LinkedList<T> linkedList;

    LinkedListQueue() {
        linkedList = new LinkedList<>();
    }

    @Override
    public void enqueue(T element) {
        linkedList.addLast(element);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return linkedList.removeFirst();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return linkedList.getFirst();
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