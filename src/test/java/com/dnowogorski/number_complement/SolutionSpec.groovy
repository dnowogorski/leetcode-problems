package com.dnowogorski.number_complement

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution = new Solution()

    @Unroll
    def "should find complement number" () {
        expect:
        solution.findComplement(number) == result

        where:
        number | result
        5 | 2
        1 | 0
    }
}
