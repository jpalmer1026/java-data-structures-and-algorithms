package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);

        System.out.println("\nLinked List after append:");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();

        myLinkedList.removeLast();

        System.out.println("\nLinked List after remove last:");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();

        myLinkedList.prepend(23);

        System.out.println("\nLinked List after prepend:");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();

        myLinkedList.removeFirst();

        System.out.println("\nLinked List after remove first:");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();

        System.out.println("\nNode at index 1 value: " + myLinkedList.get(1).value );

        myLinkedList.set(1, 47);

        System.out.println("\nNode at index 1 value: " + myLinkedList.get(1).value );

        myLinkedList.printList();

        myLinkedList.insert(1, 16);

        System.out.println("\nLinked List after insert:");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();

        myLinkedList.remove(2);

        System.out.println("\nLinked List after remove:");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();

        myLinkedList.reverse();

        System.out.println("\nLinked List after reverse:");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();




    }
}
