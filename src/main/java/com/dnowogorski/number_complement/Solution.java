package com.dnowogorski.number_complement;

public class Solution {
    public int findComplement(int num) {
        int ones = (Integer.highestOneBit(num) << 1) - 1;
        return num ^ ones;
    }
}
