package linkedlist;

public class LinkedListDemo {
    public static void main(String[] args) {
        System.out.println("Linked List Demo:");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("this");
        linkedList.add("is");
        linkedList.add("java");
        linkedList.add("linked list");
        linkedList.add("data structure");
        System.out.println("node count: " + linkedList.getCount());
        System.out.println("head node: " + linkedList.getHead());
        System.out.println("tail node: " + linkedList.getTail());
        System.out.println("dumping all nodes: ");
        linkedList.dumpData();
        int index = linkedList.search("data structure");
        if (index > 0)
            System.out.println("found at position: " + index);
        else
            System.out.println("not found");

        System.out.println("-----------------");
        linkedList.remove("java");
        System.out.println("node count: " + linkedList.getCount());
        System.out.println("dumping all nodes: ");
        linkedList.dumpData();

        System.out.println("-----------------");
        forInt();
    }

    private static void forInt() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(50);
        linkedList.add(23);
        linkedList.add(15);
        linkedList.add(2);
        System.out.println("node count: " + linkedList.getCount());
        System.out.println("head node: " + linkedList.getHead());
        System.out.println("tail node: " + linkedList.getTail());
        System.out.println("dumping all nodes: ");
        linkedList.dumpData();
        int index = linkedList.search(15);
        if (index > 0)
            System.out.println("found at position: " + index);
        else
            System.out.println("not found");

        System.out.println("-----------------");
        linkedList.remove(23);
        System.out.println("node count: " + linkedList.getCount());
        System.out.println("dumping all nodes: ");
        linkedList.dumpData();
    }
}