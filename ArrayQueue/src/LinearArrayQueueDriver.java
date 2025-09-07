public class LinearArrayQueueDriver {
    public static void main(String[] args) throws Exception {

        // System.out.println("Hi");
        LinearArrayQueue<Integer> queue = new LinearArrayQueue<>(3);

        // full queue?
        boolean full = queue.isFull();
        System.out.println("Full?: " + full);

        // empty queue?
        boolean empty = queue.isEmpty();
        System.out.println("Empty?: " + empty);

        System.out.println();

        // adding data to queue
        queue.enQueue(8);
        queue.enQueue(6);
        queue.enQueue(10);
        queue.enQueue(7);

        // removing data from queue
        System.out.println();
        int result = queue.deQueue();
        System.out.println(result + " was removed.");

        // peeking
        System.out.println();
        result = queue.peek();
        System.out.println(result + " is the top element in queue.");

    }
}
