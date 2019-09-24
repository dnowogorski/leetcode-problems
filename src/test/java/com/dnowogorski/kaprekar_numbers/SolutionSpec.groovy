package com.dnowogorski.kaprekar_numbers

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution = new Solution()

    @Unroll
    def "should check if number is kaprekar number"() {
        expect:
        solution.isKaprekarNumber(input) == result

        where:
        input << [45, 13, 10, 297, 4879, 999]
        result << [true, false, false, true, true, true]
    }
}
