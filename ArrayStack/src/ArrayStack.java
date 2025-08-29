public class ArrayStack<T> {

    int[] stack;

    int top;

    public ArrayStack(int size) {

        this.stack = new int[size];

        this.top = -1;

        System.err.println("The stack is created with the size of: " + size);

        // time complexity: O(1)
        // space complexity: O(1)

    }

    /**
     * adds an element to the top
     * 
     * @param data
     */
    public void push(int data) {

        if (isFull()) {

            System.out.println("Stack is full");

        } else {

            stack[top + 1] = data;

            top++;

            System.out.println(data + " successfully inserted into stack");

        }

    }

    /**
     * removes and returns the top element
     * 
     * @return top element
     */
    public int pop() {

        if (isEmpty()) {

            System.out.println("Stack is empty");

            return -1;

        } else {

            int data = stack[top];

            top--;

            return data;

        }

    }

    /**
     * returns the top element without removing it
     * 
     * @return the top element
     */
    public int peek() {

        /**
         * Checks if the stack is empty using the isEmpty() method
         * If the stack is empty, it prints "Stack is empty" and returns -1 as an error
         * indicator
         * If the stack is not empty, it returns the element at the current top position
         * (stack[top])
         */

        if (isEmpty()) {

            System.out.println("Stack is empty");

            return -1;

        } else {

            return stack[top];

        }

        // time complexity: O(1)
        // space complexity: O(1)

    }

    /**
     * deletes the entire stack
     */
    public void delete() {

        stack = null;

        System.out.println("Entire stack successfully deleted");

        // time complexity: O(1)
        // space complexity: O(1)

    }

    /**
     * checks if the stack is empty
     * 
     * @return true when stack is empty
     */
    public boolean isEmpty() {

        return top == -1;

        // time complexity: O(1)
        // space complexity: O(1)

    }

    /**
     * checks if the stack is full
     * 
     * @return true when the stack is full and false otherwise.
     */
    public boolean isFull() {

        return top == stack.length - 1;

        // time complexity: O(1)
        // space complexity: O(1)

    }

}
