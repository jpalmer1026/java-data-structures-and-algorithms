package algorithms.searching;

public class BinarySearch {

  public static final int NOT_FOUND = -1;

  public static int binarySearch(int[] array, int target) {
    int minIndex = 0;
    int maxIndex = array.length - 1;
    while (minIndex <= maxIndex) {
      int midIndex = (maxIndex + minIndex) / 2;
      if (target == array[midIndex]) {
        return midIndex;
      }
      if (target < array[midIndex]) {
        maxIndex = midIndex - 1;
      }
      if (target > array[midIndex]) {
        minIndex = midIndex + 1;
      }
    }

    return NOT_FOUND;
  }
}
