package datastructures.doublylinkedlist;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList myLinkedList = new DoublyLinkedList(11);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        System.out.println("\nafter append:");
        myLinkedList.append(23);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        System.out.println("\nafter remove last:");
        myLinkedList.removeLast();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        System.out.println("\nafter prepend:");
        myLinkedList.prepend(6);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        System.out.println("\nNode at index 0 has value: " + myLinkedList.get(0).value);
        System.out.println("Node at index 1 has value: " + myLinkedList.get(1).value);

        System.out.println("\nSetting node at index 1 to 4:");
        myLinkedList.set(1, 4);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        System.out.println("\nafter remove first:");
        myLinkedList.removeFirst();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        System.out.println("\nafter insert index 1:");
        myLinkedList.insert(1, 11);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        System.out.println("\nafter remove index 1:");
        myLinkedList.remove(1);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
    }

}
