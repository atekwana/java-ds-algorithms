

public class LinkedListDriver {

    public static void main(String[] args) {


        // linked list objected instantiated
        SinglyLinkedList<Integer> llds = new SinglyLinkedList<>();

        llds.createSinglyLinkedList(5);

        // printing the head of the linked list
        // System.out.println(llds.head.value);

        llds.insertSinglyLinkedList(6, 1);
        llds.insertSinglyLinkedList(7, 3);
        llds.insertSinglyLinkedList(8, 2);
        llds.insertSinglyLinkedList(9, 4);

        llds.traverseSinglyLinkedList();

        //System.out.println(llds.head.next.next.value);

        //llds.searchSinglyLinkedList(8);

       // llds.deleteSinglyLinkedList(3);

        llds.deleteEntireSinglyLinkedList();

        llds.traverseSinglyLinkedList();

    }

}
