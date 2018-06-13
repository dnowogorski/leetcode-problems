package com.dnowogorski.reverse_words_in_string_3

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {
    Solution solution = new Solution()

    @Unroll
    def "should reverse string"() {
        expect:
        solution.reverseWords(words) == result

        where:
        words << ["gin", "Let's take LeetCode contest"]
        result << ["nig", "s'teL ekat edoCteeL tsetnoc"]
    }
}
