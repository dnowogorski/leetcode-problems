package com.dnowogorski.array_partition

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {
    Solution solution = new Solution()

    @Unroll
    def "should find max sum for pairs"() {
        expect:
        solution.arrayPairSum(nums as int[]) == result

        where:
        nums << [[1, 4, 3, 2], [1, 1]]
        result << [4, 1]
    }
}
