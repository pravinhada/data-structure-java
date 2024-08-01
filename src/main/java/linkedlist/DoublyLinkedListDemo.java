package linkedlist;

public class DoublyLinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String, DNode<String>> linkedList = new DoublyLinkedList<>();
        linkedList.append("a");
        linkedList.append("b");
        linkedList.append("c");
        linkedList.append("d");
        linkedList.append("e");

        linkedList.display();
        System.out.println("Total length of linked list: " + linkedList.getLength());

        DNode<String> c = linkedList.search("c");
        System.out.println("search c: " + (c != null ? c.getData() : null));
        System.out.println("remove c");
        linkedList.remove("c");
        System.out.println("Displaying reverse");
        displayReverse(linkedList);
        System.out.println("Total length of linked list: " + linkedList.getLength());
    }

    private static void displayReverse(LinkedList<String, DNode<String>> linkedList) {
        DNode<String> cur = linkedList.getLast();
        while (cur != null) {
            System.out.println(cur.getData());
            cur = cur.getPrev();
        }
    }
}
