package com.dnowogorski.judge_route_circle

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution = new Solution()

    @Unroll
    def "should judge if robot makes a circle"() {
        expect:
        solution.judgeCircle(moves) == result

        where:
        moves << ["UD", "LL", "URDL", "DU"]
        result << [true, false, true, true]
    }
}
