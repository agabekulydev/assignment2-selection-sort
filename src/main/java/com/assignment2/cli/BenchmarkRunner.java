package com.assignment2.cli;

import com.assignment2.algorithms.SelectionSort;
import com.assignment2.metrics.PerformanceTracker;
import java.util.Random;

public class BenchmarkRunner {
    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000, 100000};
        for (int n : sizes) {
            int[] arr = generateArray(n);
            PerformanceTracker tracker = new PerformanceTracker();
            SelectionSort sorter = new SelectionSort(tracker, true);

            tracker.start();
            sorter.sort(arr);
            tracker.stop();

            System.out.printf("n=%d, time=%.3f ms, comparisons=%d, swaps=%d%n",
                    n, tracker.getElapsedMs(),
                    tracker.getComparisons(), tracker.getSwaps());
        }
    }

    private static int[] generateArray(int n) {
        Random r = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = r.nextInt(10000);
        return arr;
    }
}
