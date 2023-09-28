package algorithm;

import java.time.Duration;
import java.time.Instant;
import data.Data;

/**
 * TODO
 *  * IMPLEMENT the count of the basic operations in the sort algorithms.
 */

/**
 * SortAlgorithms class.
 * This class is to sort arrays of integers with Merge-Sort, Shell-Sort and Cocktail-Sort algorithms.
 * Every function return a Data object with the data used to complete the sort.
 *
 * @author Alex
 * @author Elena
 * @version 23/09/2023
 * @see data.Data
 */
public class SortAlgorithms {

    public SortAlgorithms(){}

    /**
     * Sorts arrays of integers using the shellShort algorithm.
     * @param v array with the integers to sort.
     * @param tam Length of the provided array.
     * @return the number of basic operations used in the sort.
     */
    public static int shellSort(int[] v, int tam){
        int countOperations =0;
        /* v con índices de 0 a tam-1 */
        int h, r, i, j, w;
        r = tam-1;
        h = 1;
        countOperations += 2;
        while (h <= r/9) {
            h = 3*h+1;
        }
        while ( h > 0 ) {
            for (i = h; i <= r; i++) {
                j = i;
                w = v[i];

                countOperations++;
                while ((j >= h) && (w<v[j-h])) {
                    v[j] = v[j-h];
                    j = j - h;

                    countOperations +=3;
                }

                v[j] = w;
                countOperations++;
            }
            h = h / 3;
        }
        return countOperations;
    }

    /**
     * Sorts arrays of integers using the shellShort algorithm.
     * @param v array with the integers to sort.
     * @param tam Length of the provided array.
     * @return the number of basic operations used in the sort.
     */
    public static int mergeSort(int[] v, int tam) {
        /* v con índices de 0 a tam-1 */
        int w[] = new int[tam];
        return mergeSortRec(v, w, 0, tam - 1);
    }
    /**
     * Does the part of partial sorting of merge sort algorithm.
     * @param v array
     * @param w a new empty array with the same size as v
     * @param l .
     * @param r length of the array
     * @return the number of basic operations used in the sort.
     */
    private static int mergeSortRec(int v[], int w[], int l, int r) {
        int countOperations = 0;
        if (l < r) {
            int m = (l + r) / 2;
            countOperations += mergeSortRec(v, w, l, m);
            countOperations += mergeSortRec(v, w, m + 1, r);
            int ia = l;
            int ib = m + 1;
            int ic = l;
            while ((ia <= m) && (ib <= r)) {
                if (v[ia] < v[ib]) {
                    w[ic] = v[ia];
                    ia++;
                    ic++;
                    countOperations++;
                } else {
                    w[ic] = v[ib];
                    ib++;
                    ic++;

                    countOperations +=2;
                }
            }
            while (ia <= m) {
                w[ic] = v[ia];
                ia++;
                ic++;
                countOperations++;
            }
            while (ib <= r) {
                w[ic] = v[ib];
                ib++;
                ic++;
                countOperations ++;
            }
            for (int i = l; i <= r; i++) {
                v[i] = w[i];
                countOperations++;
            }
        }
        return countOperations;
    }
    /**
     * It sorts arrays of integers using the shellShort algorithm.
     * @param v array with the integers to sort.
     * @param tam Length of the provided array.
     * @return the number of basic operations used in the sort.
     */
    public static int cocktailSort(int[] v, int tam){
        int countOperations=0;
        /* v con índices de 0 a tam-1 */
        boolean swapped = true;
        int start = 0;
        int end = tam;
        while (swapped == true) {
            swapped = false;
            for (int i = start; i < end - 1; ++i) {
                if (v[i] > v[i + 1]) {
                    int temp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = temp;
                    swapped = true;
                    countOperations += 2;
                }
                countOperations++;
            }
            if (swapped == false) {
                break;
            }
            swapped = false;
            end = end - 1;
            for (int i = end - 1; i >= start; i--) {
                if (v[i] > v[i + 1]) {
                    int temp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = temp;
                    swapped = true;
                    countOperations +=2;
                }
                countOperations++;
            }
            start = start + 1;
        }
        return countOperations;
    }


    /**
     * It measures the time and the operations of the selected sort
     * algorithm that takes to sort the given array
     * @param type type of the select sort algorithm to measure
     * @param array the array to sort using the sort algorithm selected.
     * @return a Data object with the time, length of the array and the operations used in the sort of the array.
     */
    public static Data measureSortAlgorithm(typeAlgorithm type, int[] array){
        int operations;
        Data data = new Data();

        /* Starts to count the time*/
        Instant startCount = Instant.now();
        try {
            operations = executeSortAlgorithm(type,array);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        }
        /* Finish to count the time*/
        Instant finishCount = Instant.now();
        /*Calculate the elapsed time*/
        long timeElapsed = Duration.between(startCount, finishCount).toNanos();

        data.setArrayLength(array.length);
        data.setTime(timeElapsed);
        data.setOperations(operations);
        data.setTypeAlgorithm(type);
        return data;
    }
    /**
     * It executes the selected sort algorithm and returns the operations used.
     * @param type type of the sort algorithm to execute
     * @param array the array to be used in the sort algorithm.
     * @return the number of operations used
     * @throws Exception when the type of algorithm is not implemented.
     */
    public static int executeSortAlgorithm(typeAlgorithm type, int[] array) throws Exception{

        switch (type){
            case MERGE_SORT:
                return mergeSort(array,array.length);
            case SHELL_SORT:
                return shellSort(array,array.length);
            case COCKTAIL_SORT:
                return cocktailSort(array,array.length);
            default:
                throw new Exception("Error not implemented type of algorithm");
        }
    }

    /**
     * It turns an array of integers into a string
     * @param array Array to convert into a string.
     * @return A string version of the array passed in the parameters
     */
    public static String arrayToString(int[] array){
        String result = "[";
        for (int i:array) {
            result = result + Integer.toString(i)+", ";
        }
        result = result+"]";
        return result;
    }
}
