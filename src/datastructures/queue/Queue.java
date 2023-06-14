package datastructures.queue;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        length++;
    }

    public Node dequeue() {
        if (this.length == 0) {
            return null;
        }
        Node oldFirst = first;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = oldFirst.next;
            oldFirst.next = null;
        }
        length--;

        return oldFirst;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst() {
        System.out.println("First: " + (first != null ? first.value : "null"));
    }

    public void getLast() {
        System.out.println("Last: " + (last != null ? last.value: "null"));
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
