package codedreamerj.queue.com;

public class Queue {
	int front = 0;
	int rear = -1;
	int[] queue;
	int size = 0;
	public static final int MAXSIZE = 5;
	
	public Queue() {
		this.queue = new int[MAXSIZE];
	}
	
	public boolean isFull() {
		if (size == MAXSIZE) {
			return true;
		}
			
		return false;	
	}
	
	public void enqueue(int number) {
		if (isFull()) {
			throw new RuntimeException("Queue is Full. Must remove item.");
		}
		this.rear = (this.rear + 1) % MAXSIZE;
		size++;
		queue[rear] = number;
	}
	
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
			
		return false;	
	}
	
	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is Empty.");
	}
		front = (front + 1) % MAXSIZE;
		size--;
		return queue[this.front];
	}
	
	public int rear() {
		return queue[this.rear];
	}
	
	public int front() {
		return queue[this.front];
	}
	
	public int size() {
		return this.size;
	}
}
