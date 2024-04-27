package src;

class MyStack<T> {
    private Node<T> top;
    private int size;

    public MyStack() {
        this.top = null;
        this.size = 0;
    }

    public boolean empty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }
}