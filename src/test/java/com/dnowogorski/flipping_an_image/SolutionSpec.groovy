package com.dnowogorski.flipping_an_image

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution = new Solution()

    @Unroll
    def "should flip and image"() {
        expect:
        solution.flipAndInvertImage(image as int[][]) == result as int[][]

        where:
        image << [[[1, 1, 0, 0], [1, 0, 0, 1], [0, 1, 1, 1], [1, 0, 1, 0]]]
        result << [[[1, 1, 0, 0], [0, 1, 1, 0], [0, 0, 0, 1], [1, 0, 1, 0]]]
    }
}
