package src;



public class Main {
    public static void main(String[] args) {
        testMyArrayList();
        testMyLinkedList();
    }

    private static void testMyArrayList() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Testing MyArrayList:");
        System.out.println("list: " + list);
        System.out.println("size: " + list.size());
        System.out.println("first element: " + list.get(0));
        System.out.println("last element: " + list.get(list.size() - 1));
        list.addFirst(0);
        list.addLast(4);
        System.out.println("list after adding first and last: " + list);
        list.removeFirst();
        list.removeLast();
        System.out.println("list after removing first and last: " + list);
        list.remove(1);
        System.out.println("list after removing element at index 1: " + list);
        System.out.println();
    }

    private static void testMyLinkedList() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Testing MyLinkedList:");
        System.out.println("list: " + list);
        System.out.println("size: " + list.size());
        System.out.println("first element: " + list.getFirst());
        System.out.println("last element: " + list.getLast());
        list.addFirst(0);
        list.addLast(4);
        System.out.println("list after adding first and last: " + list);
        list.removeFirst();
        list.removeLast();
        System.out.println("list after removing first and last: " + list);
        list.remove(1);
        System.out.println("list after removing element at index 1: " + list);
    }



public class DataStructures {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        System.out.println("        queue test                ");

            System.out.println("queue empty " + queue.isEmpty());
            System.out.println("queue size: " + queue.size());

            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.dequeue();

            System.out.println("queue peek "+queue.peek());

        System.out.println("                        ");
        System.out.println("                        ");
        System.out.println("                        ");
        System.out.println("                        ");
        System.out.println("                        ");



        System.out.println("        stack test              ");

        MyStack<Integer> stack = new MyStack<>();
        System.out.println("Is stack empty? " + stack.empty());
        System.out.println("Stack size: " + stack.size());


        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Is stack empty? " + stack.empty());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        // Pop elements
        System.out.println("Popping element "+ stack.pop());


        System.out.println("Is stack empty? " + stack.empty());

        System.out.println("                        ");
        System.out.println("                        ");
        System.out.println("                        ");
        System.out.println("                        ");
        System.out.println("                        ");
        System.out.println("        MinHeap test    ");

        MyMinHeap minHeap = new MyMinHeap();
        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(5);
        minHeap.insert(15);

        System.out.println("Min heap:");
        minHeap.printHeap();

        System.out.println("Size of heap: " + minHeap.size());


        System.out.println("Extracting min element: " + minHeap.extractMin());
        System.out.println("Min heap after extraction:");
        minHeap.printHeap();


        }


    }
}
