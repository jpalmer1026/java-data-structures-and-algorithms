package algorithms.recursion;

public class BinarySearchTree {
    Node root;

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public boolean contains(int value) {
        return contains(root, value);
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        insert(root, value);
    }

    public void deleteNode(int value) {
        deleteNode(root, value);
    }

    private boolean contains(Node currentNode, int value) {
        if (currentNode == null) {
            return false;
        }
        if (currentNode.value == value) {
            return true;
        }
        if (value < currentNode.value) {
            return contains(currentNode.left, value);
        }

        return contains(currentNode.right, value);
    }

    private Node insert(Node currentNode, int value) {
        if (currentNode == null) {
            return new Node(value);
        }
        if (value < currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
        }
        if (value > currentNode.value) {
            currentNode.right = insert(currentNode.right, value);
        }

        return currentNode;
    }

    private Node deleteNode(Node currentNode, int value) {
        if (currentNode == null) {
            return null;
        }
        if (value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value);
        } else {
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            } else if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            } else {
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right, subTreeMin);
            }
        }

        return currentNode;
    }

    private int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }

        return currentNode.value;
    }
}
