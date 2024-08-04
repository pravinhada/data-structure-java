package stack;

public class MinElementStackDemo {

    public static Stack<Integer> mainStack = new Stack<>();
    public static Stack<Integer> minStack = new Stack<>();

    public static void push(int input) throws StackOverflowException, StackUnderflowException {
        if (mainStack.isEmpty()) {
            mainStack.push(input);
            minStack.push(input);
            return;
        }
        int last = minStack.peek();
        minStack.push(Math.min(input, last));
        mainStack.push(input);
    }

    public static Integer pop() throws StackUnderflowException {
        minStack.pop();
        return mainStack.pop();
    }

    /* this will give O(1) constant time to check the minimum value */
    public static int getMinimum() throws StackUnderflowException {
        return minStack.peek();
    }

    public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
        push(4);
        push(5);
        push(2);
        push(3);
        push(6);
        push(1);
        push(9);

        System.out.print("minimum is: " + getMinimum());
    }
}
