package codedreamerj.stack.com;

public class Stack {
	
	private int array[];
	private int capacity; 
	private int top;
	
	public Stack(int capacity) {
		this.array = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
	}
	
	//Add API's: Push, Pop, Peak
	public void push(int item) {
		if (isFull()) {
			throw new RuntimeException("Stack is Full");
		}
		array[++top] = item;
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		return array[top--];
	}

	public int peak() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		
		return array[top];
	}
	//Error Handling 
	private boolean isEmpty() {
		
		return top == -1;
	}
	
	private boolean isFull() {
		
		return top == capacity - 1;
	}

}
