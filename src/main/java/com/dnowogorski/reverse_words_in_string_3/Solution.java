package com.dnowogorski.reverse_words_in_string_3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    private static final String SPACE = " ";

    public String reverseWords(String s) {
        return Arrays.stream(s.split(SPACE))
                .map(this::reverse)
                .collect(Collectors.joining(SPACE));
    }

    private String reverse(String word) {
        return new StringBuilder(word)
                .reverse()
                .toString();
    }
}
