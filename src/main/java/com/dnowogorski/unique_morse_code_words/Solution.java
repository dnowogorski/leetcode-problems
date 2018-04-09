package com.dnowogorski.unique_morse_code_words;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/unique-morse-code-words/description/
 */
public class Solution {

    private static final String[] MORSE =
            new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};


    public int uniqueMorseRepresentations(String[] words) {
        return (int) Arrays.stream(words).map(this::toMorse).distinct().count();
    }

    private String toMorse(String word) {
        StringBuilder builder = new StringBuilder();
        for (char ch : word.toCharArray()) {
            builder.append(MORSE[(int) ch - 97]);
        }
        return builder.toString();
    }
}