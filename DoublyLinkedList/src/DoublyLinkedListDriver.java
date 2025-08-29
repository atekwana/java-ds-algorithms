



public class DoublyLinkedListDriver {
    public static void main(String[] args) throws Exception {
    
        DoublyLinkedList <Integer> dll = new DoublyLinkedList<>();

        dll.createDoublyLinkedList(0);

        //System.out.println(dll.head.value);

        dll.insertDoublyLinkedList(8, 1);

        dll.insertDoublyLinkedList(6, 2);

        //System.out.println(dll.head.next.next.value);



        //dll.traverseDoublyLinkedList();

        //System.out.println(dll.tail.prev.value);

        dll.reverseTraversalDoublyLinkedList();

        System.out.println();

        dll.searchDoublyLinkedList(8);

        dll.deletingDoublyLinkedList(0);

        dll.traverseDoublyLinkedList();

        dll.deleteAllDoublyLinkedList();

        dll.traverseDoublyLinkedList();
    
    }


}
