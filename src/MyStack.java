package src;

class MyStack<T> {
    private Node<T> top; // reference to the top of the stack
    private int size; // current size of the stack

    // Constructor
    public MyStack() {
        this.top = null;
        this.size = 0;
    }

    // checking if empty
    public boolean empty() {
        return size == 0;
    }

    // current size
    public int size() {
        return size;
    }

    // peek at the element at the top of the stack without removing it
    public T peek() {
        if (empty()) {
            throw new IllegalStateException("stack empty");
        }
        return top.data;
    }

    // push an element at the top of the stack
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // pop and return the element at the top of the stack
    public T pop() {
        if (empty()) {
            throw new IllegalStateException("stack empty");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }
}
