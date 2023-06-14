package datastructures.queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(7);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.printQueue();

        System.out.println("\nLinked List after calling enqueue:");
        myQueue.enqueue((10));
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.printQueue();

        System.out.println("\nLinked List after calling dequeue:");
        System.out.println("Value dequeued: " +  myQueue.dequeue().value);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.printQueue();

        System.out.println("\nLinked List after calling dequeue:");
        myQueue.dequeue();
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.printQueue();
    }
}
