package com.dnowogorski.number_of_lines_to_write_str

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {
    Solution solution = new Solution()

    @Unroll
    def "should count number of lines and length of last line"() {
        expect:
        solution.numberOfLines(widths as int[], S) == result as int[]

        where:
        widths << [[10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10],
                   [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]]
        S << ["abcdefghijklmnopqrstuvwxyz", "bbbcccdddaaa"]
        result << [[3, 60], [2, 4]]
    }
}
