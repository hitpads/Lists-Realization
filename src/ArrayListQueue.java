import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException; // importing main utils.

public class ArrayListQueue<T> implements ListForQueue<T>, Iterable<T> {
    private ArrayList<T> arrayList;

    ArrayListQueue() {
        arrayList = new ArrayList<>();
    }

    @Override
    public void enqueue(T element) {
        arrayList.add(element);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return arrayList.remove(0);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return arrayList.get(0);
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public Iterator<T> iterator() {
        return arrayList.iterator();
    }
}