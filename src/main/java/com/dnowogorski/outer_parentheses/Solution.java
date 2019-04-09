package com.dnowogorski.outer_parentheses;

/**
 * https://leetcode.com/problems/remove-outermost-parentheses
 */
public class Solution {
    public String removeOuterParentheses(String input) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' && ++count > 1) {
                result.append(ch);
            }
            if (ch == ')' && --count > 0){
                result.append(ch);
            }
        }
        return result.toString();
    }
}
