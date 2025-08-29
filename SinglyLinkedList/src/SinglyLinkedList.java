
public class SinglyLinkedList<T> {

    // attributes
    ListNode<T> head;

    public ListNode<T> tail;

    ListNode<T> current = head;

    // increase size of linked list
    private int size;

    public void createSinglyLinkedList(T data) {

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

    // insert method singlylinkedlist
    public void insertSinglyLinkedList(T data, int location) {

        ListNode<T> pointer = new ListNode<>(); // -----------------> O(1)

        pointer.value = data; // -----------------> O(1)

        if (head == null) {

            createSinglyLinkedList(data); // --> O(1)

            return; // -----------------------------> O(1)

        } else if (location == 0) {

            pointer.next = head; // -------------------> O(1)

            head = pointer; // ------------------------> O(1)

        } else if (location >= size) {

            pointer.next = null; // -------------------> O(1)

            tail.next = pointer; // -------------------> O(1)

            tail = pointer; // ------------------------> O(1)

        } else {

            /**
             * create a new node and make it the head
             * index variable for loop control
             * loop through linkedlist up excluding the last element
             * increment index
             * create a new node and make it the current node
             * make the current node the node
             * make
             */

            current = head; // -----------------------> O(1)

            int index = 0; // ------------------------> O(1)

            while (index < location - 1) { // --------> O(n)

                current = current.next; // -----------> O(1)

                index++; // --------------------------> O(1)
            }

            ListNode<T> nextnode = current.next; // ---------> O(1)

            current.next = pointer; // ------------------> O(1)

            pointer.next = nextnode; // -----------------> O(1)

        }

        size++; // -----------------> O(1)

        // time complexity: O(1)

        // space complexity: O(1)

    }

    @SuppressWarnings("UnnecessaryReturnStatement")
    public void traverseSinglyLinkedList() {

        if (head == null) { // ------------------------------> O(1)

            System.out.println("SLL does not exist!"); // -> O(1)

            return;

        } else {

            ListNode<T> temp = head; // ----------------------> O(1)

            while (temp != null) { // -----------------> O(n)

                System.out.print(temp.value); // ------> O(1)

                if (temp.next != null) { // -----------> O(1)

                    System.out.print(" -> "); // ----> O(1)

                }

                temp = temp.next; // ------------------> O(1)

            }

            System.out.println("\n"); // ------------> O(1)

        }

        // time complexity: O(n)

        // space complexity: O(1)

    }

    public boolean searchSinglyLinkedList(int target) {

        int index = 0; // ------------------> O(1)

        if (head == null) { // ------------------> O(1)

            return false; // ------------------> O(1)

        } else {

            current = head; // ------------------> O(1)

            while (current != null) { // ------------------> O(n)

                index++; // ------------------> O(1)

                if (current.value.equals(target)) { // ------------------> O(1)

                    System.out.println(target + " is at node found at " + index); // ------------------> O(1)

                    return true; // ------------------> O(1)

                }

                current = current.next; // ------------------> O(1)

            }

        }

        System.out.print("node not found"); // ------------------> O(1)

        return false; // ------------------> O(1)

        // time complexity: O(n)

        // space complexity: O(1)

    }

    @SuppressWarnings("UnnecessaryReturnStatement")
    public void deleteSinglyLinkedList(int location) {

        /**
         * 1. Check if the head node is null; return immediately if the list is empty.
         * 
         * Deleting the first node:
         * 2. If the deletion location is at the start of the linked list (location =
         * 0):
         * a. Move the head to the next node: head = head.next.
         * b. Reduce the size of the linked list by 1: size--.
         * c. If the linked list becomes empty (size == 0), set tail to null.
         * 
         * Deleting the last node:
         * 3. If the deletion location is at or beyond the last node in the linked list:
         * a. Create a current node reference pointing to the head.
         * 
         * Special case: If the list contains only one node:
         * b. If head.next is null, set both head and tail to null.
         * 
         * General case: More than one node in the linked list:
         * c. Traverse the list using a while loop, stopping at the second-to-last node.
         * - The loop should run while current.next != null.
         * d. Set current.next to null, effectively removing the last node.
         * e. Update the tail to point to current.
         * f. Decrease the size of the linked list by 1.
         * 
         * Deleting a node at a specific position:
         * 4. If the location is within the range of the linked list (not first or last
         * node):
         * a. Create a current node reference pointing to the head.
         * b. Use a for loop to traverse the list up to the node before the target node.
         * c. Update the next pointer of the current node to skip over the node being
         * deleted.
         * d. If the node to be deleted has a prev pointer, update it accordingly.
         * e. Reduce the size of the linked list by 1.
         */

        if (head == null) { // ------------------> O(1)

            return; // list is empty, nothing to delete

        } else if (location == 0) { // delete at the start of the linkedlist // ------------------> O(1)

            head = head.next;

            size--;

            if (size == 0) { // ------------------> O(1)

                tail = null; // if the list becomes empty, set tail to null

            }

            return;

            // deleting last node in a linkedlist
        } else if (location >= size - 1) { // ------------------> O(1)

            current = head;

            while (current.next != null) { // ------------------> O(n)

                current = current.next;

                // only one element in linkedlist
                if (current == head) { // ------------------> O(1)

                    tail = head = null;

                    size--;

                    return;

                }

                // more than one element in linkedlist
                current.next = null;

                tail = current;

                size--;

            }

        } else { // deleting node at a specific location // ------------------> O(1)

            current = head;

            for (int index = 0; index < location - 1; index++) { // ------------------> O(n)

                current = current.next;

            }

            current.next = current.next.next;

            size--;

        }

        // time complexity: O(n)

        // space complexity: O(1)

    }

    public void deleteEntireSinglyLinkedList() {

        // set the entire linkedlist to null
        head = tail = null; // ------------------> O(1)

        System.out.println("The entire linked list has been deleted"); // ------------------> O(1)

        // time complexity: O(1)

        // space complexity: O(1)

    }

}
