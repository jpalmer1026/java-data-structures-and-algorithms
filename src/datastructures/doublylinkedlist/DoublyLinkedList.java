package datastructures.doublylinkedlist;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    static class Node {
        int value;
        Node next;
        Node previous;

        Node(int value) {
            this.value = value;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public Node removeLast() {
        if (this.length == 0) {
            return null;
        }
        Node last = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = last.previous;
            tail.next = null;
            last.previous = null;
        }
        length--;
        return last;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (this.length != 0) {
            newNode.next = head;
            head.previous = newNode;
        } else {
            tail = newNode;
        }
        head = newNode;
        length++;
    }

    public Node removeFirst() {
        if (this.length == 0) {
            return null;
        }
        Node oldHead = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = oldHead.next;
            head.previous = null;
            oldHead.next = null;
        }
        length--;

        return oldHead;
    }

    public Node get(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.previous;
            }
        }

        return temp;
    }

    public boolean set(int index, int value) {
        Node node = get(index);
        if (node != null) {
            node.value = value;
            return true;
        }

        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > this.length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == this.length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;
        newNode.next = after;
        newNode.previous = before;
        before.next = newNode;
        after.previous = newNode;
        length++;

        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == this.length - 1) {
            return removeLast();
        }
        Node temp = get(index);
        Node before = temp.previous;
        Node after = temp.next;
        before.next = after;
        after.previous = before;
        temp.next = null;
        temp.previous = null;
        length--;

        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (tail == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
