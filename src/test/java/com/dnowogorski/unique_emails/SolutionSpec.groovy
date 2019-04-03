package com.dnowogorski.unique_emails

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {
    Solution solution = new Solution()

    @Unroll
    def "should return number of emails which receive message"() {
        expect:
        solution.numUniqueEmails(A as String[]) == result

        where:
        A << [["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]]
        result << [2]
    }
}
