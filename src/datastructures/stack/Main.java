package datastructures.stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();

        System.out.println("\nAfter push");
        myStack.push(10);
        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();

        System.out.println("\nAfter pop");
        myStack.pop();
        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();

        System.out.println("\nAfter pop");
        myStack.pop();
        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();

    }
}
