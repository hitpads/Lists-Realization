package src;

public class MyMinHeap {
    private MyArrayList<Integer> heap;

    // constructor to initialize an empty heap
    public MyMinHeap() {
        heap = new MyArrayList<>();
    }

    // method to find the parent index of a node
    private int parent(int i) {
        return (i - 1) / 2;
    }

    // method to find the left child index of a node
    private int leftChild(int i) {
        return 2 * i + 1;
    }

    // method to find the right child index of a node
    private int rightChild(int i) {
        return 2 * i + 2;
    }

    // method to swap two elements in the heap
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // restore heap property upwards from the given index
    private void heapifyUp(int i) {
        while (i > 0 && heap.get(i) < heap.get(parent(i))) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    // restore heap property downwards from the given index
    private void heapifyDown(int i) {
        int smallest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }

        if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            heapifyDown(smallest);
        }
    }

    // insert a new element into the heap
    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    // extract the minimum element from the heap
    public int extractMin() {
        if (isEmpty()) {
            throw new IllegalStateException("heap is empty");
        }

        int min = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        heapifyDown(0);
        return min;
    }

    // peek at the minimum element without removing it
    public int peekMin() {
        if (isEmpty()) {
            throw new IllegalStateException("heap is empty");
        }

        return heap.get(0);
    }

    // check if the heap is empty
    public boolean isEmpty() {
        return heap.size() == 0;
    }

    // get the size of the heap
    public int size() {
        return heap.size();
    }

    // print the elements of the heap
    public void printHeap() {
        for (Integer element : heap) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
