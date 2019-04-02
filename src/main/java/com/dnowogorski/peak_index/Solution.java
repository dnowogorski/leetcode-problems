package com.dnowogorski.peak_index;

public class Solution {

    public int peakIndexInMountainArray(int[] A) {
        int i = 1;
        while (A[i - 1] < A[i] && i + 1< A.length && A[i + 1] > A[i]) i++;
        return i;
    }
}
