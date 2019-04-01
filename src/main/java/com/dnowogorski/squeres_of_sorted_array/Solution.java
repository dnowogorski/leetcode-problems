package com.dnowogorski.squeres_of_sorted_array;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 *
 * Given an array of integers A sorted in non-decreasing order,
 * return an array of the squares of each number, also in sorted non-decreasing order.
 */
class Solution {

    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int i = 0;
        for (int number : A) result[i++] = number * number;
        Arrays.sort(result);
        return result;
    }
}
