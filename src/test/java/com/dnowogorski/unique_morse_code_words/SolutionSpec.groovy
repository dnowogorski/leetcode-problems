package com.dnowogorski.unique_morse_code_words

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution = new Solution()

    @Unroll
    def "should count unique morse representations"() {
        expect:
        solution.uniqueMorseRepresentations(words) == result

        where:
        words << [["gin", "zen", "gig", "msg"] as String[]]
        result << [2]
    }
}
