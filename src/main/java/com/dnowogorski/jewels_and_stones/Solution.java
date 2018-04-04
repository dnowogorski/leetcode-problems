package com.dnowogorski.jewels_and_stones;

/**
 * https://leetcode.com/problems/jewels-and-stones/description/
 */
class Solution {
    int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.contains(String.valueOf(S.charAt(i)))) {
                count++;
            }
        }
        return count;
    }

    int numJewelsInStonesV2(String J, String S) {
        return count(J, S, 0);
    }

    private int count(String J, String s, int acc) {
        if (s.length() == 0) return acc;
        if (J.contains(String.valueOf(s.charAt(0)))) acc++;
        return count(J, s.substring(1), acc);
    }
}
