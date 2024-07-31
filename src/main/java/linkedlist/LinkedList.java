package linkedlist;

import java.util.List;

public interface LinkedList<T, R> {
    void append(T data);

    void prepend(T data);

    void appendAll(List<T> data);

    void remove(T data);

    R search(T data);

    void display();

    int getLength();

    R getLast();

    R getFirst();
}
