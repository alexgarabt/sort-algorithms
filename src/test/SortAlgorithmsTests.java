package test;

import static org.junit.Assert.*;
import org.junit.Test;
import algorithm.SortAlgorithms;
import java.util.Arrays;
/**
 * Unit test, for testing the sort algorithms.
 * @see algorithm.SortAlgorithms
 * @version 27/10/2023
 */
public class SortAlgorithmsTests {
    private static final int[] chaoticArrayNormal = {17, 32, 5, 42, 6, 9, 29, 49, 27, 15, 36, 20, 2, 44, 8, 46, 13, 30, 3, 11, 35, 25, 38, 7, 4, 33, 10, 22, 12, 16, 21, 26, 19, 28, 14, 23, 1, 34, 37, 48, 18, 45, 47, 50, 24, 41, 40, 31, 39, 43 };
    private static final int[] orderedArrayNormal = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
    private static final int[] chaoticArrayWithDuplicates = {17, 32, 5, 42, 6, 9, 29, 49, 27, 15, 36, 20, 2, 44, 8, 46, 13, 30, 3, 11, 35, 25, 38, 7, 4, 33, 10, 22, 12, 16, 21, 26, 19, 28, 23, 1, 8, 34, 37, 48, 18, 45, 47, 50, 16, 41, 40, 31, 39, 43, 5, 6, 30, 13, 8 };
    private static final int[] orderedArrayWithDuplicates = {1, 2, 3, 4, 5, 5, 6, 6, 7, 8, 8, 8, 9, 10, 11, 12, 13, 13, 15, 16, 16, 17, 18, 19, 20, 21, 22, 23, 25, 26, 27, 28, 29, 30, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    @Test
    public void testShellSort() {
        // Arrange
        int[] arr = Arrays.copyOf(chaoticArrayNormal, chaoticArrayNormal.length);

        // Act
        SortAlgorithms.shellSort(arr,arr.length);

        // Assert
        assertArrayEquals(orderedArrayNormal, arr);
    }
    @Test
    public void testMergeSort() {
        // Arrange
        int[] arr = Arrays.copyOf(chaoticArrayNormal, chaoticArrayNormal.length);

        // Act
        SortAlgorithms.mergeSort(arr,arr.length);

        // Assert
        assertArrayEquals(orderedArrayNormal, arr);
    }
    @Test
    public void testCocktailSort() {
        // Arrange
        int[] arr = Arrays.copyOf(chaoticArrayNormal, chaoticArrayNormal.length);

        // Act
        SortAlgorithms.cocktailSort(arr,arr.length);

        // Assert
        assertArrayEquals(orderedArrayNormal, arr);
    }

    @Test
    public void testShellSortEmptyArray() {
        // Arrange
        int[] arr = {};
        int[] expected = {};

        // Act
        SortAlgorithms.shellSort(arr,arr.length);

        // Assert
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortEmptyArray() {
        // Arrange
        int[] arr = {};
        int[] expected = {};

        // Act
        SortAlgorithms.mergeSort(arr,arr.length);

        // Assert
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testCocktailSortEmptyArray() {
        // Arrange
        int[] arr = {};
        int[] expected = {};

        // Act
        SortAlgorithms.cocktailSort(arr,arr.length);

        // Assert
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testShellSortAlreadySortedArray() {
        // Arrange
        int[] arr = Arrays.copyOf(orderedArrayNormal, orderedArrayNormal.length);

        // Act
        SortAlgorithms.shellSort(arr, arr.length);

        // Assert
        assertArrayEquals(orderedArrayNormal, arr);
    }

    @Test
    public void testMergeSortAlreadySortedArray() {
        // Arrange
        int[] arr = Arrays.copyOf(orderedArrayNormal, orderedArrayNormal.length);

        // Act
        SortAlgorithms.mergeSort(arr, arr.length);

        // Assert
        assertArrayEquals(orderedArrayNormal, arr);
    }

    @Test
    public void testCocktailSortAlreadySortedArray() {
        // Arrange
        int[] arr = Arrays.copyOf(orderedArrayNormal, orderedArrayNormal.length);

        // Act
        SortAlgorithms.cocktailSort(arr, arr.length);

        // Assert
        assertArrayEquals(orderedArrayNormal, arr);
    }

    @Test
    public void testShellSortArrayWithDuplicates() {
        // Arrange
        int[] arr = Arrays.copyOf(chaoticArrayWithDuplicates, chaoticArrayWithDuplicates.length);

        // Act
        SortAlgorithms.shellSort(arr,arr.length);

        // Assert
        assertArrayEquals(orderedArrayWithDuplicates, arr);
    }

    @Test
    public void testMergeSortArrayWithDuplicates() {
        // Arrange
        int[] arr = Arrays.copyOf(chaoticArrayWithDuplicates, chaoticArrayWithDuplicates.length);

        // Act
        SortAlgorithms.mergeSort(arr,arr.length);

        // Assert
        assertArrayEquals(orderedArrayWithDuplicates, arr);
    }

    @Test
    public void testCocktailSortArrayWithDuplicates() {
        // Arrange
        int[] arr = Arrays.copyOf(chaoticArrayWithDuplicates, chaoticArrayWithDuplicates.length);

        // Act
        SortAlgorithms.cocktailSort(arr,arr.length);

        // Assert
        assertArrayEquals(orderedArrayWithDuplicates, arr);
    }
}
