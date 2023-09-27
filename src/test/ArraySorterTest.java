package test;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Simple class to test the sort functions developed with some edge case.
 * @see ArraySorterSelector
 * @author Alex
 * @version 25/09/2023
 */
public class ArraySorterTest {

    @Test
    public void testSort() {
        // Arrange
        int[] arr = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};

        // Act
        ArraySorterSelector.sort(arr);

        // Assert
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortEmptyArray() {
        // Arrange
        int[] arr = {};
        int[] expected = {};

        // Act
        ArraySorterSelector.sort(arr);

        // Assert
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortAlreadySortedArray() {
        // Arrange
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        // Act
        ArraySorterSelector.sort(arr);

        // Assert
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortArrayWithDuplicates() {
        // Arrange
        int[] arr = {5, 3, 5, 4, 3};
        int[] expected = {3, 3, 4, 5, 5};

        // Act
        ArraySorterSelector.sort(arr);

        // Assert
        assertArrayEquals(expected, arr);
    }
}
