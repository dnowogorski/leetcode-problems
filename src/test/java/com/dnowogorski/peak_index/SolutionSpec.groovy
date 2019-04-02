package com.dnowogorski.peak_index

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {
    Solution solution = new Solution()

    @Unroll
    def "should find peek index in mountain array"() {
        expect:
        solution.peakIndexInMountainArray(A as int[]) == result

        where:
        A << [[0, 1, 0], [0, 2, 1, 0]]
        result << [1, 1]
    }
}
