package com.dnowogorski.self_dividing_numbers

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {
    Solution solution = new Solution()

    @Unroll
    def "should return all self dividing numbers from given boundary"() {
        given:
        int left = 1
        int right = 22

        when:
        List<Integer> result = solution.selfDividingNumbers(left, right)

        then:
        result == [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
    }
}
