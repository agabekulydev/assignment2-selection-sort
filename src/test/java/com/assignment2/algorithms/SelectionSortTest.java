package com.assignment2.algorithms;

import com.assignment2.metrics.PerformanceTracker;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class SelectionSortTest {

    @Test
    void testSortingRandomArray() {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int[] expected = arr.clone();
        Arrays.sort(expected);

        SelectionSort sorter = new SelectionSort(new PerformanceTracker(), true);
        sorter.sort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        SelectionSort sorter = new SelectionSort(new PerformanceTracker(), true);
        sorter.sort(arr);
        assertEquals(0, arr.length);
    }

    @Test
    void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = arr.clone();

        SelectionSort sorter = new SelectionSort(new PerformanceTracker(), true);
        sorter.sort(arr);

        assertArrayEquals(expected, arr);
    }
}
