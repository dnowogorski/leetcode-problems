package com.dnowogorski.kaprekar_numbers;

/**
 * https://www.geeksforgeeks.org/kaprekar-number/
 */
public class Solution {

    boolean isKaprekarNumber(int n) {
        long squared = n * n;
        String squaredString = String.valueOf(squared);
        for (int i = 0; i < squaredString.length() - 1; i++) {
            int firstPart = Integer.valueOf(squaredString.substring(0, i + 1));
            int secondPart = Integer.valueOf(squaredString.substring(i + 1));
            if (firstPart != 0 && secondPart != 0 && firstPart + secondPart == n) return true;
        }
        return false;
    }
}
