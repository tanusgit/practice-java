package linklist;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
	public static void show() {
	Queue<String> queue = new ArrayDeque<>();
	//we can use add or offer method to add an element to the queue
	queue.add("Nim");
	queue.add("tulsi");
	System.out.print(queue);
	//element and peek method are same but element method throws exception if the 
	//queue is empty
	System.out.println(queue.peek());
	//poll and remove are same method but remove() throws an exception when the 
	//queue is empty
	
	}
}
