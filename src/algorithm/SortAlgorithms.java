package algorithm;

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
     */
    public static void shellSort(int[] v, int tam){
        /* v con índices de 0 a tam-1 */
        int h, r, i, j, w;
        r = tam-1;
        h = 1;
        while (h <= r/9) {
            h = 3*h+1;
        }
        while ( h > 0 ) {
            for (i = h; i <= r; i++) {
                j = i;
                w = v[i];
                while ((j >= h) && (w<v[j-h])) {
                    v[j] = v[j-h];
                    j = j - h;
                }
                v[j] = w;
            }
            h = h / 3;
        }
    }

    /**
     * Sorts arrays of integers using the shellShort algorithm.
     * @param v array with the integers to sort.
     * @param tam Length of the provided array.
     */
    public static void mergeSort(int[] v, int tam) {
        /* v con índices de 0 a tam-1 */
        int w[] = new int[tam];
        mergeSortRec(v, w, 0, tam - 1);
    }
    /**
     * Does the part of partial sorting of merge sort algorithm.
     * @param v
     * @param w
     * @param l
     * @param r
     */
    public static void mergeSortRec(int v[], int w[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSortRec(v, w, l, m);
            mergeSortRec(v, w, m + 1, r);
            int ia = l;
            int ib = m + 1;
            int ic = l;
            while ((ia <= m) && (ib <= r)) {
                if (v[ia] < v[ib]) {
                    w[ic] = v[ia];
                    ia++;
                    ic++;
                } else {
                    w[ic] = v[ib];
                    ib++;
                    ic++;
                }
            }
            while (ia <= m) {
                w[ic] = v[ia];
                ia++;
                ic++;
            }
            while (ib <= r) {
                w[ic] = v[ib];
                ib++;
                ic++;
            }
            for (int i = l; i <= r; i++) {
                v[i] = w[i];
            }
        }
    }

    /**
     * It sorts arrays of integers using the shellShort algorithm.
     * @param v array with the integers to sort.
     * @param tam Length of the provided array.
     */
    public static void cocktailSort(int[] v, int tam){
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
                }
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
                }
            }
            start = start + 1;
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
            result = result+Integer.toString(i)+", ";
        }
        result = result+"]";
        return result;
    }
}
