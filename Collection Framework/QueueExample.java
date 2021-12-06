package collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(45);
		queue.offer(85);
		queue.add(96);
		queue.offer(74);
		queue.add(41);
		queue.offer(63);
		
		System.out.println("Queue before operation = "+queue);
		
		System.out.println("Peek method = "+queue.peek());
		System.out.println("Queue afther operation = "+queue);
		
		System.out.println("Poll method = "+queue.poll());
		System.out.println("Queue after operation = "+queue);
		
		Integer i = 85;
		System.out.println("Remove method = "+queue.remove(i));
		System.out.println("Queue after operation = "+queue);
	}

}
