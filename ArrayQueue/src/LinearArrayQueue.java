public class LinearArrayQueue<T> {

    // protected variable(s)
    protected int[] arr;
    protected int top; // points to the end element
    protected int begOfQueue; // points to the front element

    /**
     * arr = [10, 20, 30, _, _, _]
     *         ^          ^
     * begOfQueue=0 top=2
     */

    /**
     * method to create an array
     *
     * @param size
     */
    public LinearArrayQueue(int size) {

        this.arr = new int[size];
        this.top = -1;
        this.begOfQueue = -1;

        System.out.println("Array Queue size: " + size);
        System.out.println();

        // Time Complexity: O(1)
        // Space Complexity: O(N)

    }

    /**
     * method to check if array is full
     *
     * @return true if array is full; false otherwise
     */
    public boolean isFull() {

        return top == arr.length - 1;

        // Time Complexity: O(1)
        // Space Complexity: O(N)

    }

    /**
     * method to check if the array is empty
     * the logic is to check if the beginning of the queue is empty
     *
     * @return true if the beginning of queue is empty; false otherwise
     */
    public boolean isEmpty() {

        return begOfQueue == -1;

        // Time Complexity: O(1)
        // Space Complexity: O(N)

    }

    /**
     * method to add data into queue
     *
     * @param data
     */
    public void enQueue(int data) {

        // first check if queue is full
        if (isFull()) {

            System.out.println("The Queue is Full!");

            // if queue is empty then instantiate the beginning of queue to position 0
        } else if (isEmpty()) {

            begOfQueue = 0;
            // top starts at -1 (empty)
            arr[++top] = data; // increment first, then use
            System.out.println("Successfully added " + data + " to the queue.");

        } else {

            // top starts at -1 (empty)
            arr[++top] = data; // increment first, then use
            System.out.println("Successfully added " + data + " to the queue.");

        }

        // Time Complexity: O(1)
        // Space Complexity: O(1)

    }

    /**
     * method to dequeue
     *
     * @return
     */
    public int deQueue() {

        // first check if the queue is empty
        if (isEmpty()) {

            System.out.println("The Queue is empty.");
            return -1;

        } else {

            // get the element at the front of the queue and move the front pointer forward
            int result = arr[begOfQueue++];

            // check if queue becomes empty after removing this element
            // (when front pointer moves past the rear pointer)
            if (begOfQueue > top) {

                // reset both pointers to -1 to indicate empty queue
                begOfQueue = top = -1;

            }

            return result;

        }

        // Time Complexity: O(1)
        // Space Complexity: O(1)

    }

    /**
     * method to return the top element
     *
     * @return begOfQueue
     */
    public int peek() {

        if (!(isEmpty())) {

            return arr[begOfQueue];

        } else {

            System.out.println("The Queue is empty.");
            return -1;

        }

        // Time Complexity: O(1)
        // Space Complexity: O(1)

    }

    /**
     * method to delete queue
     */
    public void delete() {

        arr = null;
        System.out.println("Queue has been successfully deleted.");

        // Time Complexity: O(1)
        // Space Complexity: O(1)

    }

}
