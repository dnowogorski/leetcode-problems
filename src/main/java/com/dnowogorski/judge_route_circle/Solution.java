package com.dnowogorski.judge_route_circle;

/**
 * https://leetcode.com/problems/judge-route-circle/description/
 */
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char c: moves.toCharArray()) {
            if (c == 'U') y++;
            if (c == 'D') y--;
            if (c == 'L') x--;
            if (c == 'R') x++;
        }
        return x == 0 && y == 0;
    }
}
