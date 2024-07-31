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

        System.out.println("Displaying reverse");
        displayReverse(linkedList);
    }

    private static void displayReverse(LinkedList<String, DNode<String>> linkedList) {
        DNode<String> cur = linkedList.getLast();
        while (cur != null) {
            System.out.println(cur.getData());
            cur = cur.getPrev();
        }
    }
}
