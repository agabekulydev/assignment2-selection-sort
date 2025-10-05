package com.assignment2.metrics;

public class PerformanceTracker {
    private long comparisons;
    private long swaps;
    private long arrayReads;
    private long arrayWrites;
    private long startTimeNs;
    private long endTimeNs;

    public void reset() {
        comparisons = swaps = arrayReads = arrayWrites = 0L;
        startTimeNs = endTimeNs = 0L;
    }

    public void start() {
        reset();
        startTimeNs = System.nanoTime();
    }

    public void stop() {
        endTimeNs = System.nanoTime();
    }

    public void incComparisons() { comparisons++; }
    public void incSwaps() { swaps++; }
    public void incReads() { arrayReads++; }
    public void incWrites() { arrayWrites++; }

    public long getComparisons() { return comparisons; }
    public long getSwaps() { return swaps; }
    public long getArrayReads() { return arrayReads; }
    public long getArrayWrites() { return arrayWrites; }
    public double getElapsedMs() { return (endTimeNs - startTimeNs) / 1e6; }
}
