package datastructures.hashtable;

import java.util.ArrayList;

public class Hashtable {
    private int size = 7;
    private Node[] dataMap;

    public Hashtable() {
        dataMap = new Node[size];
    }

    static class Node {
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public void set(String key, int value) {
        Node newNode = new Node(key, value);
        int hash = hash(key);
        if (dataMap[hash] == null) {
            dataMap[hash] = newNode;
        } else {
            Node temp = dataMap[hash];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key) {
        int hash = hash(key);
        Node temp = dataMap[hash];
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }

        return 0;
    }

    public ArrayList<String> keys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for (Node node : dataMap) {
            Node temp = node;
            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }

        return allKeys;
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println(" {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciivalue = keyChars[i];
            hash = (hash + asciivalue * 23) % dataMap.length;
        }

        return hash;
    }
}
