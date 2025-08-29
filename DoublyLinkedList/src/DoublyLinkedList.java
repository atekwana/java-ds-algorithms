
public class DoublyLinkedList<T> {

    /**
     * 1. create a head listnode
     * 2. create a tail listnode
     */
    ListNode<T> head;

    ListNode<T> tail;

    int size;

    /*
     * creating a doubly linked list *simplest method*d
     */
    DoublyLinkedList() {

        this.head = null;

        this.tail = null;

        this.size = 0;

    }

    public void createDoublyLinkedList(T data) {

        /**
         * 1. Create a new list node & pass the methods param as an arg
         * 2. always check if the head node is null
         * 
         */
        ListNode<T> pointer = new ListNode<>(data); // ------------------------------> O(1)

        if (head == null) { // ------------------------------> O(1)

            head = pointer; // ------------------------------> O(1)

            tail = pointer; // ------------------------------> O(1)

            size = 1; // ------------------------------> O(1)

        }

        // time complexity: O(1)
        // space complexity: O(1)

    }

    public void insertDoublyLinkedList(T data, int location) {

        /**
         * step 1. create a new node(pointer) making it the
         * step 2. always check if the list is empty
         * step 3. if the location is at 0
         * 1
         * 
         */

        ListNode<T> pointer = new ListNode<>(data);

        // if the list is empty
        if (head == null) {

            head = pointer;

            tail = pointer;

        } else {

            /**
             * insert at location 0
             * step 1: check if the location if 0
             * step 2: if step one is true then pointer.next equals the head
             * step 3: check if the head is not null
             * step 4: if head is not null head.prev equals the new node(pointer)
             * step 5: outside the if statement update head to equal new node(pointer)
             * step 6: return
             */

            if (location == 0) {

                pointer.next = head;

                pointer.prev = null;

                head.prev = pointer;

                head = pointer;

            }
            /**
             * insert at end of list
             * step 1: check if the location is greater or equal to size of the list
             * step 2: if step one is true then pointer.next equals null
             * step 3: if step one is true then tail.prev equals tail
             * step 4: check if the tail is not null
             * step 5: if head is not null tail.next equals the new node(pointer)
             * step 6: outside the if statement update tail to equal new node(pointer)
             * step 7: return
             */
            else if (location >= size) {

                pointer.next = null;

                pointer.prev = tail;

                tail.next = pointer;

                tail = pointer;

            }

            /**
             * insert in the middle
             * step 1: create new node(current) equals head
             * step 2: create an index variable
             * step 3: while the index is in the middle
             * a: current node equals current.next
             * b: increment the index
             * step 4: pointer.next equals current.next
             * step 5: pointer.prev equals current
             * step 6: current.next.prev equals pointer
             * setp 7: current.next = pointer
             * step 8: increment size
             */
            else {

                ListNode<T> current = head;

                int index = 0;

                while (index < size - 1) {

                    current = current.next;

                    index++;

                }

                pointer.next = current.next;

                pointer.prev = current;

                current.next.prev = pointer;

                current.next = pointer;

            }

        }

        size++;

        // time complexity: O(N)
        // space complexity: O(1)

    }

    public void traverseDoublyLinkedList() {

        /**
         * Step 1. always check if the head node(pointer) is null
         * a. if head is null then sysout dne
         * Step 2. else
         * a. create a new node(current) equals head
         * b. while current is not null
         * c. current equals current.next
         * 
         * **for aesthics after step 2b
         * you can add a sysout printing each value (current.value) with "<->"
         * outside the while loop add a sysout saying null
         */

        if (head == null) {

            System.out.println("DLL does not exist");

        } else {

            ListNode<T> current = head;

            while (current != null) {

                System.out.print(current.value + "<->");

                current = current.next;

            }

            System.out.print("null");

        }

        // time complexity: O(N)
        // space complexity: O(1)

    }

    public void reverseTraversalDoublyLinkedList() {
        /**
         * Step 1. always check if the tail node(pointer) is null
         * a. if tail is null then sysout dne
         * Step 2. else
         * a. create a new node(current) equals tail
         * b. while current is not null
         * c. current equals current.prev
         *
         * **for aesthetics after step 2b
         * you can add a sysout printing each value (current.value) with "<->"
         * outside the while loop add a sysout saying null
         */
        if (head == null) {

            System.out.println("DLL does not exist");

        } else {

            ListNode<T> current = tail;

            while (current != null) {

                System.out.print(current.value + "<->");

                current = current.prev;

            }

            System.out.print("null");
        }

        // time complexity: O(N)
        // space complexity: O(1)
    }

    public boolean searchDoublyLinkedList(T data) {

        /**
         * while loop approach
         * step 1: create an index variable & initialize it to 0
         * step 2: always check if the list is empty
         * step 3: else create a new node called current equals head
         * step 4: while current does not equal null
         * a: check if the current value is equal to the data
         * b: print the index
         * c: return true
         * step 5: make current equal to current.next (moving onto the next node)
         * step 6: increment index
         * step 7: print error message
         * step 8: return false
         */

        int index = 0;

        if (head == null) {

            return false;

        } else {

            ListNode<T> current = head;

            while (current != null) {

                if (current.value.equals(data)) {

                    System.out.println(data + " is at node " + index); // ------------------> O(1)

                    return true;

                }

                current = current.next;

                index++;

            }

        }

        System.out.println("ListNode Not Found!");

        return false;

        // time complexity: O(N)
        // space complexity: O(1)

    }

    public void deletingDoublyLinkedList(int location) {
        /**
         * 1. Check if the head node is null; return immediately if the list is empty.
         * - If the head is null, the list doesn't exist. Return immediately.
         * 
         * Deleting the first node (location = 0):
         * 2. If the deletion location is at the start of the linked list (location =
         * 0):
         * a. If there is only one node in the list (size == 1), set both head and tail
         * to null.
         * b. If there are multiple nodes, move the head to the next node and set the
         * previous pointer of the new head to null.
         * c. Reduce the size of the linked list by 1: size--.
         * 
         * Deleting the last node (location >= size - 1):
         * 3. If the deletion location is at or beyond the last node (location >= size -
         * 1):
         * a. If there is only one node in the list (size == 1), set both head and tail
         * to null.
         * b. Otherwise, traverse the list to the second-to-last node (tail.prev).
         * c. Set the next pointer of the second-to-last node to null, effectively
         * removing the last node.
         * d. Update the tail to point to the second-to-last node.
         * e. Decrease the size of the linked list by 1: size--.
         * 
         * Deleting a node at a specific position (0 < location < size - 1):
         * 4. If the location is within the valid range of the linked list (not the
         * first or last node):
         * a. Create a current node reference pointing to the head.
         * b. Use a for loop to traverse the list up to the node just before the target
         * node (location - 1).
         * c. Update the next pointer of the current node to skip the node being deleted
         * (current.next = current.next.next).
         * d. If the node to be deleted has a next node, update its prev pointer to
         * point back to the current node.
         * e. Reduce the size of the linked list by 1: size--.
         */

        if (head == null) {

            System.out.println("DLL does not exist");

        } else if (location == 0) {

            if (size == 1) { // here is if there's only one item in the list

                head = tail = null;

            } else {

                head = head.next;

                head.prev = null;

            }

            size--;

        } else if (location >= size) {

            ListNode<T> current = tail.prev;

            while (current.next != null) {

                if (size == 1) { // in case there is only one item in the list

                    head = tail = null;

                } else {

                    current.next = null;

                    tail = current;

                }

                size--;

            }

        } else {

            int index = 0;

            ListNode<T> current = head;

            while (index < size - 1) {

                current = current.next;

                index++;

            }

            current.next = current.next.next;

            if (current.next != null) {

                current.next.prev = current;

            }

            size--;

        }

        // time complexity: O(N)
        // space complexity: O(1)

    }

    public void deleteAllDoublyLinkedList() {

        /**
         * Check if the list is empty:
         * 
         * If head is null, the list is already empty. No deletion is needed.
         * 
         * Traverse the list:
         * 
         * Start from the head node and move through each node using the next pointer.
         * For each node, set the prev and next pointers to null. This ensures that all
         * references to the nodes are removed and helps with memory management.
         * 
         * Update head and tail:
         * 
         * After traversing and dereferencing all nodes, set both head and tail to null
         * to indicate that the list is empty.
         * 
         * Final cleanup:
         * 
         * The list is now deleted, and the memory for the nodes will be cleared when
         * they are no longer referenced (handled automatically by garbage collection in
         * languages like Java).
         */

        ListNode<T> current = head;

        while (current != null) {

            current.next = null;

            current.prev = null;

            current = current.next;

        }

        head = tail = null;

        System.out.println("\nDLL has been deleted.");

        // time complexity: O(N)
        // space complexity: O(1)

    }

}
