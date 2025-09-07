public class CircularArrayQueueDriver {

    public static void main(String[] args) throws Exception {

        CircularArrayQueue<Integer> queue = new CircularArrayQueue<>(3);

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

        empty = queue.isEmpty();
        System.out.println("Empty?: " + empty);

        // removing data from queue
        System.out.println();
        int result = queue.deQueue();
        System.out.println(result + " was removed.");

    }

}
