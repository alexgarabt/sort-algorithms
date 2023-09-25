package test;
import algorithm.SortAlgorithms;
import java.util.Arrays;


/**
 * Simple class to change the method of sort to test in ArraySorterTest.java.
 * @see ArraySorterTest
 * @author Alex
 * @version 25/09/2023
 */
public class ArraySorter {

    public static void sort(int[] arr) {
        SortAlgorithms.mergeSort(arr,arr.length);
        /*
         * Others functions to test.
         * SortAlgorithms.cocktailSort(arr,arr.length);
         * SortAlgorithms.shellSort(arr,arr.length);
         */

    }
}
