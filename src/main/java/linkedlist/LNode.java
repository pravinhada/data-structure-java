package linkedlist;

public class LNode<T> {

    private final T data;
    private LNode<T> next; /* points to next element of link list */

    public LNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public LNode<T> getNext() {
        return next;
    }

    public void setNext(LNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "[" + this.data + "]";
    }
}
