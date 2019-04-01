package com.dnowogorski.squeres_of_sorted_array

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {
    Solution solution = new Solution()

    @Unroll
    def "should return squares of sorted array"() {
        expect:
        solution.sortedSquares(A as int[]) == result as int[]

        where:
        A << [[-4, -1, 0, 3, 10], [-7, -3, 2, 3, 11]]
        result << [[0, 1, 9, 16, 100], [4, 9, 9, 49, 121]]
    }

    @Unroll
    def "should return squares of sorted array for optimized solution"() {
        expect:
        solution.sortedSquaresOptimized(A as int[]) == result as int[]

        where:
        A << [[-4, -1, 0, 3, 10], [-12, -3, 2, 3, 11]]
        result << [[0, 1, 9, 16, 100], [4, 9, 9, 121, 144]]
    }
}
