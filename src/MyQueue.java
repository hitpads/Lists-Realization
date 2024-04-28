package src;

class MyQueue<T> {
    private Node<T> front; // reference to the front of the queue
    private Node<T> rear; // reference to the rear of the queue
    private int size; // current size of the queue

    // empty queue constructor
    public MyQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // сheck if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // current size of the queue
    public int size() {
        return size;
    }

    // peek at the element at the front of the queue without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("queue is empty");
        }
        return front.data;
    }

    // add an element to the rear of the queue
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    // remove and return the element at the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("queue is empty");
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }
}
