package algorithms.recursion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factorial 4: " + Factorial.factorial(4));
        System.out.println("Fibonacci 29: " + Fibonacci.fibonacci(29));

        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);
        myBST.insert(3);

        System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("Root->Left: " + myBST.root.left.value);
        System.out.println("Root->Right: " + myBST.root.right.value);
        System.out.println("BST contains 2: " + myBST.contains(2));
        System.out.println("BST contains 4: " + myBST.contains(4));

        myBST.deleteNode(3);
        System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("Root->Left: " + myBST.root.left.value);
        System.out.println("Root->Right: " + myBST.root.right);
        System.out.println("BST contains 3: " + myBST.contains(3));
    }
}
