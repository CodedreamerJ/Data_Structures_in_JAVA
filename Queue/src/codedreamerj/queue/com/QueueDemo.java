package codedreamerj.queue.com;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue q = new Queue();
		
		q.enqueue(5);
		q.enqueue(15);
		q.enqueue(25);
		q.enqueue(35);
		q.enqueue(45);
		
		System.out.println("The size of the queue is " + q.size());
		System.out.println("The rear of the queue is " + q.rear());
		System.out.println("The front of the queue is " + q.front());
		
		q.dequeue();
		
		System.out.println("The size of the queue is " + q.size());
		System.out.println("The rear of the queue is " + q.rear());
		System.out.println("The front of the queue is " + q.front());
		
		
	}

}
