public class Tester {
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(6);
        queue.printQueue();
        System.out.println(queue.dequeue());
        queue.printQueue();



    }
}
