package linkedlist;

import java.util.List;

public class DoublyLinkedList<T> implements LinkedList<T, DNode<T>> {

    private DNode<T> head;
    private DNode<T> tail;
    private int count;

    @Override
    public DNode<T> getLast() {
        return this.tail;
    }

    @Override
    public DNode<T> getFirst() {
        return this.head;
    }

    @Override
    public void append(T data) {
        DNode<T> newNode = new DNode<>(data);
        if (this.count == 0) {
            this.head = newNode;
        } else {
            DNode<T> current = this.head;
            while (current.getNext() != null)
                current = current.getNext();

            current.setNext(newNode);
            newNode.setPrev(current);
        }
        this.tail = newNode;

        this.count++;
    }

    @Override
    public void prepend(T data) {
        DNode<T> newNode = new DNode<>(data);
        if (this.count == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.setNext(this.head);
            this.head.setPrev(newNode);
            this.head = newNode;
        }
        this.count++;
    }

    @Override
    public void appendAll(List<T> data) {
        data.forEach(this::append);
    }

    @Override
    public void remove(T data) {
        DNode<T> result = this.search(data);
        if (result != null) {
            DNode<T> prev = result.getPrev();
            if (result.getNext() != null)
                result.getNext().setPrev(prev);
            else
                this.tail = prev;
            if (prev != null)
                prev.setNext(result.getNext());
            this.count--;
        }
    }

    @Override
    public DNode<T> search(T data) {
        DNode<T> current = this.head;
        while (current != null) {
            if (current.getData().equals(data)) return current;
            current = current.getNext();
        }
        return null;
    }

    @Override
    public void display() {
        DNode<T> current = this.getFirst();
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    @Override
    public int getLength() {
        return this.count;
    }
}
