package src;

public class MyMinHeap {
    private MyArrayList<Integer> heap;

    public MyMinHeap() {
        heap = new MyArrayList<Integer>();
    }


    private int parent(int i) {
        return (i - 1) / 2;
    }


    private int leftChild(int i) {
        return 2 * i + 1;
    }


    private int rightChild(int i) {
        return 2 * i + 2;
    }


    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }


    private void heapifyUp(int i) {
        while (i > 0 && heap.get(i) < heap.get(parent(i))) {
            swap(i, parent(i));
            i = parent(i);
        }
    }


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


    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }


    public int extractMin() {


        int min = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        heapifyDown(0);
        return min;
    }


    public int peekMin() {

        return heap.get(0);
    }


    public boolean isEmpty() {
        return heap.size()==0;
    }


    public int size() {
        return heap.size();
    }


    public void printHeap() {
        for (Integer element : heap) {
            System.out.print(STR."\{element} ");
        }
        System.out.println();
    }
}

