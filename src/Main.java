public class Main {
    public static void main(String[] args) {

        LinkedListQueue<Integer> qqq = new LinkedListQueue<>();
        qqq.enqueue(1);
        qqq.enqueue(12);
        qqq.enqueue(143);
        qqq.enqueue(11);
        qqq.enqueue(154);
        for (int i : qqq) {
            System.out.println(i);
        }
        System.out.println(qqq.isEmpty());
        System.out.println(qqq.size());
        qqq.dequeue();
        System.out.println(qqq.peek());
        System.out.println(qqq.size());
        }
}