package com.dnowogorski.self_dividing_numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/self-dividing-numbers/
 */
public class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int num = left; num <= right; num++)
            if (isSelfDividing(num)) result.add(num);
        return result;
    }

    private boolean isSelfDividing(int num) {
        if (num < 10) return true;
        int originalValue = num;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0 || originalValue % digit != 0) return false;
            num /= 10;
        }
        return true;
    }
}
