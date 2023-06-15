package algorithms.sorting.mergesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] originalArray = {4, 2, 6, 5, 1, 3};
        int[] sortedArray = MergeSort.mergeSort(originalArray);

        System.out.println("\nOriginal Array: " + Arrays.toString(originalArray));
        System.out.println("\nSorted Array: " + Arrays.toString(sortedArray));
    }
}
