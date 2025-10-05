package com.assignment2.algorithms;

import com.assignment2.metrics.PerformanceTracker;

public class SelectionSort {
    private final PerformanceTracker tracker;
    private final boolean precheckSorted;

    public SelectionSort(PerformanceTracker tracker, boolean precheckSorted) {
        this.tracker = tracker;
        this.precheckSorted = precheckSorted;
    }

    public void sort(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Array is null");
        if (arr.length < 2) return;

        if (precheckSorted && isSorted(arr)) return;

        int left = 0;
        int right = arr.length - 1;
        boolean swapped;

        do {
            swapped = false;
            int minIndex = left;
            int maxIndex = right;

            for (int i = left; i <= right; i++) {
                tracker.incReads();
                tracker.incComparisons();
                if (arr[i] < arr[minIndex]) minIndex = i;
                tracker.incComparisons();
                if (arr[i] > arr[maxIndex]) maxIndex = i;
            }


            if (minIndex != left) {
                swap(arr, minIndex, left);
                swapped = true;
            }


            if (maxIndex == left) maxIndex = minIndex;


            if (maxIndex != right) {
                swap(arr, maxIndex, right);
                swapped = true;
            }

            left++;
            right--;
        } while (left < right && swapped);
    }

    private boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            tracker.incComparisons();
            tracker.incReads();
            if (arr[i - 1] > arr[i]) return false;
        }
        return true;
    }

    private void swap(int[] arr, int i, int j) {
        tracker.incSwaps();
        tracker.incReads();
        tracker.incWrites();
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
