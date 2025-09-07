public class CircularArrayQueue<T> {

    // protected attribute(s)
    protected int[] arr;
    protected int top;
    protected int size;
    protected int begOfQueue;

    /**
     * method to create queue
     *
     * @param size
     */
    public CircularArrayQueue(int size) {

        this.arr = new int[size];
        this.top = -1;
        this.size = size;
        this.begOfQueue = -1;

        // Time Complexity: O(1)
        // Space Complexity: O(N)

    }

    /**
     * method to check if queue is full
     *
     * @return true if queue is full; else return false
     */
    public boolean isFull() {

        // arr = [30, _, _, 10, 20]  // Size 5, one empty slot
        //        ^        ^     ^
        // begOfQueue=0    top=4

        // (top + 1) % arr.length = (4 + 1) % 5 = 0
        // begOfQueue = 0
        // So (top + 1) % arr.length == begOfQueue → Queue is FULL
        return (top + 1) % arr.length == begOfQueue;

        // Time Complexity: O(1)
        // Space Complexity: O(N)

    }

    /**
     * method to check if queue is empty
     *
     * @return true if queue is empty; else return false
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

        if (isFull()) {

            System.out.println("The Queue is full.");

        } else if (isEmpty()) {

            begOfQueue = 0;
            // top starts at -1 (empty)
            arr[++top] = data; // increment first, then use
            System.out.println("Successfully added " + data + " to the queue.");

        } else {

            if (top + 1 == size) {

                top = 0;

            }

            // top starts at -1 (empty) if it starts at -1 you need to add 1 to it before adding top
            // top = -1 + 1 = 0
            // top =  0
            // but if you say top++
            // 1 + -1 = 0
            arr[++top] = data; // increment first, then use
            System.out.println("Successfully added " + data + " to the queue.");

        }

        // Time Complexity: O(1)
        // Space Complexity: O(1)

    }

    /**
     * method to deque data from queue
     *
     * @return
     */
    public int deQueue() {

        if(isEmpty()) {

            System.out.println("The Queue is empty.");
            return -1;

        } else {

            // get the data before moving the pointer
            int data = arr[begOfQueue];
            arr[begOfQueue] = 0; // optional: clear the slot

            // check if this was the last element
            if (begOfQueue == top) {

                // Queue becomes empty
                begOfQueue = top = -1;

            } else {

                // move front pointer in circular fashion
                begOfQueue = (begOfQueue + 1) % size;

            }

            return data;

        }

    }

    /**
     * method to peek the first element in queue
     *
     * @return the top element
     */
    public int peek() {

        if (!isEmpty()) {

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
