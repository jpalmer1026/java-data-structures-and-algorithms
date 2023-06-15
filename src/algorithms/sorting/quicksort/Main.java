package algorithms.sorting.quicksort;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] array = {4, 6, 1, 7, 3, 2, 5};
    QuickSort.quickSort(array);
    System.out.println(Arrays.toString(array));
  }
}
