package com.dnowogorski.judge_route_circle;

/**
 * https://leetcode.com/problems/judge-route-circle/description/
 */
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char c: moves.toCharArray()) {
            switch (c) {
                case 'U' : y++; break;
                case 'D' : y--; break;
                case 'L' : x--; break;
                case 'R' : x++; break;
            }
        }
        return x == 0 && y == 0;
    }
}
