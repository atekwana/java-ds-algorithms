
public class ListNode<T> {

    T value;

    ListNode<T> next;

    ListNode<T> prev;

    public ListNode() {

    }

    public ListNode(T value) {

        this.value = value;

        this.next = null;

        this.prev = null;
        
    }

}
