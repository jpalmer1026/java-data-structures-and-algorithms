package algorithms.sorting.bubblesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        BubbleSort.bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
