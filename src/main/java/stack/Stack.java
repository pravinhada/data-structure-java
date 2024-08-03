package stack;

public class Stack<T> {
	private static final int MAX_SIZE = 40;
	private Element<T> top;
	private int size = 0;

	public Stack() {
		super();
	}

	/* O(1) complexity */
	public void push(T data) throws StackOverflowException {
		if (this.isFull()) {
			throw new StackOverflowException();
		}

        this.top = new Element<T>(data, top);
		this.size++;

	}

	/* O(1) complexity */
	public T pop() throws StackUnderflowException {
		if (this.isEmpty()) {
			throw new StackUnderflowException();
		}
		T result = top.getData();
		top = top.getNext();
		this.size--;

		return result;
	}

	/* O(1) complexity */
	public T peek() throws StackUnderflowException {
		if (this.isEmpty()) {
			throw new StackUnderflowException();
		}
		return top.getData();
	}

	/* O(1) complexity */
	public boolean isEmpty() {
		return this.size == 0;
	}

	/* O(1) complexity */
	public boolean isFull() {
		return this.size == MAX_SIZE;
	}

	/* O(1) complexity */
	public int getSize() {
		return this.size;
	}

	/* O(n) times */
	public void display() {
		Element<T> cur = this.top;
		while (cur != null) {
			System.out.println("[" + cur.getData() + "]");
			cur = cur.getNext();
		}
	}
}
