package com.dnowogorski.outer_parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public String removeOuterParentheses(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();
        int beginIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    result.append(input, beginIndex + 1, i);
                    beginIndex = i + 1;
                }
            }
        }
        return result.toString();
    }
}
