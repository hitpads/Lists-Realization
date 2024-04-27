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
}
