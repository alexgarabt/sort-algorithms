package test;
import algorithm.SortAlgorithms;


/**
 * Simple class to change the method of sort to test in ArraySorterTest.java.
 * @see ArraySorterTest
 * @author Alex
 * @version 25/09/2023
 */
public class ArraySorterSelector {

    public static void sort(int[] arr) {
        SortAlgorithms.shellSort(arr,arr.length);
        /*
         * Others functions to test.
         * SortAlgorithms.mergeSort(arr,arr.length);
         * SortAlgorithms.cocktailSort(arr,arr.length);
         * SortAlgorithms.shellSort(arr,arr.length);
         */

    }
}
