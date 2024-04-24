
// This is an interface for a queue implemented using a list

public interface ListForQueue<T> {
    public void enqueue(T element);

    public T dequeue();

    public T peek();

    public boolean isEmpty();

    public int size();


}
