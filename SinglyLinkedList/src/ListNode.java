
public class ListNode<T> {

    protected T value;

    protected ListNode<T> next;

    protected ListNode<T> prev;

    public ListNode() {

    }

    public ListNode(T value) {

        this.value = value;

        this.next = null;
    }

}
