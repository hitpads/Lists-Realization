package src;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T extends Comparable<T>> implements MyList<T> {
    private class MyNode {
        T data;
        MyNode next;
        MyNode prev;

        MyNode(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private MyNode head;
    private MyNode tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void add(T item) {
        addLast(item);
    }

    @Override
    public void set(int index, T item) {
        MyNode node = getNode(index);
        if (node != null) {
            node.data = item;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void add(int index, T item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            MyNode current = getNode(index);
            MyNode newNode = new MyNode(item);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    @Override
    public void addFirst(T item) {
        MyNode newNode = new MyNode(item);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T item) {
        MyNode newNode = new MyNode(item);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public T get(int index) {
        MyNode node = getNode(index);
        if (node != null) {
            return node.data;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    @Override
    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return tail.data;
    }

    @Override
    public void remove(int index) {
        MyNode node = getNode(index);
        if (node != null) {
            if (node.prev == null) {
                head = node.next;
            } else {
                node.prev.next = node.next;
            }
            if (node.next == null) {
                tail = node.prev;
            } else {
                node.next.prev = node.prev;
            }
            size--;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
    }

    @Override
    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        size--;
    }

    @Override
    public void sort() {
        if (head == null || head.next == null) {
            return;
        }
            boolean swapped;
            MyLinkedList<T>.MyNode node;

            if (head == null)
                return;

            do {
                swapped = false;
                node = head;

                while (node.next != null) {
                    if (node.data.compareTo(node.next.data) > 0) {
                        T t = node.next.data;
                        node.next.data = node.data;
                        node.data = t;
                        swapped = true;
                    }
                    node = node.next;
                }
            } while (swapped);
        }

    @Override
    public int indexOf(Object object) {
        MyNode current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(object)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        MyNode current = tail;
        int index = size - 1;
        while (current != null) {
            if (current.data.equals(object)) {
                return index;
            }
            current = current.prev;
            index--;
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        MyNode current = head;
        int index = 0;
        while (current != null) {
            array[index++] = current.data;
            current = current.next;
        }
        return array;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private MyNode current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    private MyNode getNode(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        MyNode current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
    
}
