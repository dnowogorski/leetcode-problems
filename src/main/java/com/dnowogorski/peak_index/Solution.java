package com.dnowogorski.peak_index;

/**
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */
public class Solution {

    public int peakIndexInMountainArray(int[] input) {
        int i = 1;
        while (input[i - 1] < input[i] && i + 1< input.length && input[i + 1] > input[i]) i++;
        return i;
    }

    int peakIndexInMountainArrayRecursive(int[] input) {
        return helper(input, 0, input.length - 1);
    }

    private int helper(int[] array, int start, int finish) {
        int mid = (start + finish) / 2;
        if (array[mid] < array[mid + 1]) return helper(array, mid + 1, finish);
        if (array[mid] > array[mid + 1] && array[mid - 1] > array[mid]) return helper(array, start, mid - 1);
        return mid;
    }
}
