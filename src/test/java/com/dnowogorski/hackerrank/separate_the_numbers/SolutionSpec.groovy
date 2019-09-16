package com.dnowogorski.hackerrank.separate_the_numbers

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution = new Solution()

    @Unroll
    def "should separate numbers"() {
        expect:
        solution.separateNumbers(input) == result

        where:
        input | result
        "1234" | "YES 1"
        "91011" | "YES 9"
        "99100" | "YES 99"
        "101103" | "NO"
        "010203" | "NO"
        "13" | "NO"
        "1" | "NO"
    }
}
