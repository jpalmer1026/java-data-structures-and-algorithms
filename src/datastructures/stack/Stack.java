package datastructures.stack;

public class Stack {
    private Node top;
    private int height;

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height > 0) {
            newNode.next = top;
        }
        top = newNode;
        height++;
    }

    public Node pop() {
        if (height == 0) {
            return null;
        }
        Node oldTop = top;
        top = oldTop.next;
        oldTop.next = null;
        height--;

        return oldTop;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop() {
        String msg = top != null ? Integer.toString(top.value) : "null";
        System.out.println("Top : " + msg);
    }

    public void getHeight() {
        System.out.println("Height: " + height);
    }

}
