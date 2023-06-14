package datastructures.hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable myHashtable = new Hashtable();
        myHashtable.set("nails", 100);
        myHashtable.set("tile", 50);
        myHashtable.set("lumber", 80);
        myHashtable.set("bolts", 200);
        myHashtable.set("screws", 140);
        myHashtable.printTable();

        System.out.println("\nlumber quantity: " + myHashtable.get("lumber"));
        System.out.println("bolts quantity: " + myHashtable.get("bolts"));
        System.out.println("nails quantity: " + myHashtable.get("nails"));
        System.out.println("hammer quantity: " + myHashtable.get("hammer"));

        System.out.println("\nall keys: " + myHashtable.keys());
    }
}
