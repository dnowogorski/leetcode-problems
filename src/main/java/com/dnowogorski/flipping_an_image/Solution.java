package com.dnowogorski.flipping_an_image;

/**
 * https://leetcode.com/problems/flipping-an-image/description/
 */
public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int N = A.length;
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = A[i][N - j - 1] == 0 ? 1 : 0;
            }
        }
        return result;
    }
}
