package com.dnowogorski.hackerrank.separate_the_numbers;

/**
 * https://www.hackerrank.com/challenges/separate-the-numbers/problem
 */
public class Solution {

    String separateNumbers(String input) {
        for (int i = 1; i <= input.length() / 2; i++) {
            String firstString = input.substring(0, i);
            String result = findSolutionFor(input, firstString);
            if (result.equals(input)) {
                return "YES " + firstString;
            }
        }
        return "NO";
    }

    private String findSolutionFor(String input, String firstString) {
        long firstNumber = Long.parseLong(firstString);
        StringBuilder result = new StringBuilder(firstString);
        int j = firstString.length();
        while (j < input.length()) {
            long next = ++firstNumber;
            result.append(next);
            j += String.valueOf(next).length();
        }
        return result.toString();
    }
}
