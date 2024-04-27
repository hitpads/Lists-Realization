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
        System.out.println(STR."list: \{list}");
        System.out.println(STR."size: \{list.size()}");
        System.out.println(STR."first element: \{list.get(0)}");
        System.out.println(STR."last element: \{list.get(list.size() - 1)}");
        list.addFirst(0);
        list.addLast(4);
        System.out.println(STR."list after adding first and last: \{list}");
        list.removeFirst();
        list.removeLast();
        System.out.println(STR."list after removing first and last: \{list}");
        list.remove(1);
        System.out.println(STR."list after removing element at index 1: \{list}");
        System.out.println();
    }

    private static void testMyLinkedList() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Testing MyLinkedList:");
        System.out.println(STR."list: \{list}");
        System.out.println(STR."size: \{list.size()}");
        System.out.println(STR."first element: \{list.getFirst()}");
        System.out.println(STR."last element: \{list.getLast()}");
        list.addFirst(0);
        list.addLast(4);
        System.out.println(STR."list after adding first and last: \{list}");
        list.removeFirst();
        list.removeLast();
        System.out.println(STR."list after removing first and last: \{list}");
        list.remove(1);
        System.out.println(STR."list after removing element at index 1: \{list}");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("--- TESTING MyStack, MyQueue, MyMinHeap ---");
        System.out.println();
        System.out.println();
        System.out.println();
        MyQueue<Integer> queue = new MyQueue<>();
        System.out.println("        queue test                ");

        System.out.println(STR."queue empty \{queue.isEmpty()}");
        System.out.println(STR."queue size: \{queue.size()}");

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();

        System.out.println(STR."queue peek \{queue.peek()}");

        System.out.println("                        ");
        System.out.println("                        ");
        System.out.println("                        ");
        System.out.println("        stack test              ");

        MyStack<Integer> stack = new MyStack<>();
        System.out.println(STR."Is stack empty? \{stack.empty()}");
        System.out.println(STR."Stack size: \{stack.size()}");


        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(STR."Is stack empty? \{stack.empty()}");
        System.out.println(STR."Stack size: \{stack.size()}");
        System.out.println(STR."Top element: \{stack.peek()}");

        // Pop elements
        System.out.println(STR."Popping element \{stack.pop()}");


        System.out.println(STR."Is stack empty? \{stack.empty()}");

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

        System.out.println(STR."Size of heap: \{minHeap.size()}");


        System.out.println(STR."Extracting min element: \{minHeap.extractMin()}");
        System.out.println("Min heap after extraction:");
        minHeap.printHeap();
    }
}