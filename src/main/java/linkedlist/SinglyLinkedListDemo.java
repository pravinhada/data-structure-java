package linkedlist;

import java.util.List;

public class SinglyLinkedListDemo {
    public static void main(String[] args) {
        System.out.println("Linked List Demo:");
        LinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.appendAll(List.of("a", "b", "c", "d", "e"));
        System.out.println("node count: " + linkedList.getLength());
        System.out.println("dumping all nodes: ");
        linkedList.display();
        int index = linkedList.search("d");
        if (index > 0)
            System.out.println("found at position: " + index);
        else
            System.out.println("not found");

        System.out.println("-----------------");
        linkedList.remove("d");
        System.out.println("node count: " + linkedList.getLength());
        System.out.println("dumping all nodes: ");
        linkedList.display();

        System.out.println("-----------------");
        forInt();
    }

    private static void forInt() {
        LinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.append(1);
        linkedList.append(50);
        linkedList.append(23);
        linkedList.append(15);
        linkedList.append(2);
        System.out.println("node count: " + linkedList.getLength());
        System.out.println("dumping all nodes: ");
        linkedList.display();
        int index = linkedList.search(15);
        if (index > 0)
            System.out.println("found at position: " + index);
        else
            System.out.println("not found");

        System.out.println("-----------------");
        System.out.println("removing 23");
        linkedList.remove(23);
        System.out.println("node count: " + linkedList.getLength());
        System.out.println("prepending node 9");
        linkedList.prepend(9);
        System.out.println("dumping all nodes: ");
        linkedList.display();
    }
}