package linkedlist;

import java.util.List;

public interface LinkedList<T> {
    void append(T data);

    void prepend(T data);

    void appendAll(List<T> data);

    void remove(T data);

    int search(T data);

    void display();

    int getLength();
}
