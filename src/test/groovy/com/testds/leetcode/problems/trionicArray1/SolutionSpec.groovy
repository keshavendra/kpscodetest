package com.testds.leetcode.problems.trionicArray1

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test IsTrionic"() {
        when:
        def actualResult = solution.isTrionic(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums               | expectedResult
        [1, 3, 5, 4, 2, 6] | true
        [2, 1, 3]          | false
        [0, 2, 1, 3]       | true
        [2, 4, 3, 3]       | false
        [6, 8, 2, 5, 9]    | true
        [9, 4, 6, 8]       | false
    }

    def cleanup() {
        solution = null
    }
}
