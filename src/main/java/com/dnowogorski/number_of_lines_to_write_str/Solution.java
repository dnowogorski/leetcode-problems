package com.dnowogorski.number_of_lines_to_write_str;

public class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int lines = 0;
        int currentLineLength = 0;
        for (int ch : S.toCharArray()) {
            int index = ch - 97;
            if (currentLineLength + widths[index] > 100) {
                currentLineLength = 0;
                lines++;
            }
            currentLineLength += widths[index];
        }
        return new int[] { lines + 1, currentLineLength };
    }
}
