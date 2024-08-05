package comp.techlabs.list;
import java.util.LinkedList;
import java.util.Queue;


public class QueueTest {
	
	    public static void main(String[] args) {
	        // Create a Queue using LinkedList
	        Queue<Integer> queue = new LinkedList<>();

	        // Enqueue: Add elements to the queue
	        queue.add(1);
	        queue.add(2);
	        queue.add(3);

	        System.out.println("Queue after adding elements: " + queue);

	        // Peek: View the front element without removing it
	        int front = queue.peek();
	        System.out.println("Front element (using peek): " + front);

	        // Dequeue: Remove elements from the queue
	        int removedElement = queue.remove();
	        System.out.println("Removed element (using remove): " + removedElement);
	        System.out.println("Queue after removing element: " + queue);

	        // Check if the queue is empty
	        boolean isEmpty = queue.isEmpty();
	        System.out.println("Is the queue empty? " + isEmpty);
	        
	       
	    }
	}


