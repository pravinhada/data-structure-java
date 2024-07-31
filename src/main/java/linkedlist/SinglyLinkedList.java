package linkedlist;

import java.util.List;

public class SinglyLinkedList<T> implements LinkedList<T, LNode<T>> {

    private LNode<T> head;
    private LNode<T> tail;
    private int count;

    @Override
    public LNode<T> getLast() {
        return this.tail;
    }

    @Override
    public LNode<T> getFirst() {
        return this.head;
    }

    /* order of n O(n) for add node in worse case */
    @Override
    public void append(T data) {
        LNode<T> node = new LNode<>(data);
        this.tail = node;
        if (this.count == 0) {
            this.head = node;
        } else {
            LNode<T> cur = this.head;
            while (cur.getNext() != null)
                cur = cur.getNext();

            cur.setNext(node);
        }
        this.count++;
    }

    @Override
    public void appendAll(List<T> data) {
        data.forEach(this::append);
    }

    @Override
    public void prepend(T data) {
        LNode<T> node = new LNode<>(data);
        if (this.count > 0) {
            LNode<T> cur = this.head;
            node.setNext(cur);
        }
        this.head = node;
        this.count++;
    }

    /* order of n O(n) for remove in worse case */
    @Override
    public void remove(T data) {
        if (this.count <= 0) return;

        LNode<T> cur = this.tail;
        if (cur.getData().equals(data)) {
            this.head = this.head.getNext();
            this.count--;
        } else {
            LNode<T> prev = this.tail;
            cur = this.head.getNext();
            while (cur.getNext() != null) {
                if (cur.getData().equals(data)) {
                    prev.setNext(cur.getNext());
                    this.count--;
                }
                prev = cur;
                cur = cur.getNext();
            }
        }
    }

    /* order of n O(n) for search in worse case */
    @Override
    public LNode<T> search(T data) {
        if (this.count <= 0) return null;

        int position = 0;
        LNode<T> cur = this.head;
        if (this.tail.getData().equals(data)) return this.tail;
        while (cur != null) {
            ++position;
            if (cur.getData().equals(data)) return cur;
            else cur = cur.getNext();
        }
        return null;
    }

    @Override
    public void display() {
        LNode<T> cur = this.getFirst();
        while (cur != null) {
            System.out.println(cur.getData());
            cur = cur.getNext();
        }
    }

    @Override
    public int getLength() {
        return this.count;
    }
}
