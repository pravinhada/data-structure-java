package queue;

import java.lang.reflect.Array;

/* O(n) for space */
public class Queue<T> {
    private final T[] element;
    private static final int MAX_SIZE = 20;
    private static final int SPECIAL_EMPTY_VALUE = -1;

    private int head = SPECIAL_EMPTY_VALUE;
    private int tail = SPECIAL_EMPTY_VALUE;

    public Queue(Class<T> clazz) {
        element = (T[]) Array.newInstance(clazz, MAX_SIZE);
    }

    /* O(1) constant time */
    public boolean isEmpty() {
        return this.head == SPECIAL_EMPTY_VALUE;
    }

    /* O(1) constant time */
    public boolean isFull() {
        int next = (this.tail + 1) % element.length;
        return next == this.head;
    }

    /* O(1) constant time */
    public void enqueue(T data) throws QueueOverflowException {
        System.out.println("enqueuing: " + data);
        if (isFull()) {
            throw new QueueOverflowException();
        }
        this.tail = (this.tail + 1) % element.length;
        element[this.tail] = data;

        if (this.head == SPECIAL_EMPTY_VALUE) {
            this.head = this.tail;
        }
    }

    /* O(1) constant time */
    public T dequeue() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }
        T data = element[head];
        if (this.head == this.tail) {
            this.head = SPECIAL_EMPTY_VALUE;
        } else {
            this.head = (this.head + 1) % element.length;
        }
        return data;
    }

    public T peek() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }
        return element[this.head];
    }

    public void display() {
        if (isEmpty()) return;
        int index = head;
        while (true) {
            if (index == tail) {
                System.out.println(" " + element[index]);
                break;
            }
            System.out.println(" " + element[index]);
            index = (index + 1) % element.length;
        }
    }
}
