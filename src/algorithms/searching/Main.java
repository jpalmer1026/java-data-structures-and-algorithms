package algorithms.searching;

public class Main {
  public static void main(String[] args) {
    int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    System.out.println("Value 8 index: " + BinarySearch.binarySearch(myArray, 8));
    System.out.println("Value 17 index: " + BinarySearch.binarySearch(myArray, 17));
  }
}
