package com.dnowogorski.reverse_string

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {
    Solution solution = new Solution()

    @Unroll
    def "should reverse string"() {
        expect:
        solution.reverseString(words) == result

        where:
        words << ["gin", "zen", "gig", "msg"]
        result << ["nig", "nez", "gig", "gsm"]
    }
}
