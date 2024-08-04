package queue;

public class QueueDemo {

    public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
        Queue<String> queue = new Queue<>(String.class);

        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        queue.enqueue("e");
        queue.enqueue("f");
        queue.enqueue("g");
        queue.enqueue("h");
        queue.enqueue("i");
        queue.enqueue("j");
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("peek: " + queue.peek());
        queue.display();
    }
}
