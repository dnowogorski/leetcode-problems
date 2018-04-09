package com.dnowogorski.jewels_and_stones

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution = new Solution()

    @Unroll
    def "should count jewels in stones v1"() {
        expect:
        solution.numJewelsInStones(J, S) == result

        where:
        J | S | result
        "aA" | "aAAbbbb" | 3
        "z" | "ZZ" | 0
    }

    @Unroll
    def "should count jewels in stones v2"() {
        expect:
        solution.numJewelsInStonesV2(J, S) == result

        where:
        J | S | result
        "aA" | "aAAbbbb" | 3
        "z" | "ZZ" | 0
    }
}
