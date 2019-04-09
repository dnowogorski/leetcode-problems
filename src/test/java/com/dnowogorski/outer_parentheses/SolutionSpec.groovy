package com.dnowogorski.outer_parentheses

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {
    Solution solution = new Solution()

    @Unroll
    def "should reverse string"() {
        expect:
        solution.removeOuterParentheses(input) == result

        where:
        input << ["(()())(())", "(()())(())(()(()))", "()()"]
        result << ["()()()", "()()()()(())", ""]
    }
}
