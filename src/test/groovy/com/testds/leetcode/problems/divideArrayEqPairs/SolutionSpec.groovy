package com.testds.leetcode.problems.divideArrayEqPairs

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test DivideArray"() {
        when:
        def actualResult = solution.divideArray(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                                                                                                                                                                                                                     | expectedResult
        [9, 9, 19, 10, 9, 12, 2, 12, 3, 3, 11, 5, 8, 4, 13, 6, 2, 11, 9, 19, 11, 15, 9, 17, 15, 12, 5, 14, 12, 16, 18, 16, 10, 3, 8, 9, 16, 20, 2, 4, 16, 12, 11, 14, 20, 16, 2, 18, 17, 20, 3, 13, 16, 17, 1, 1, 11, 20, 20, 4] | false
        [9, 9, 19, 10, 9, 12, 2, 12, 3, 3, 11, 5, 8, 13, 2, 9, 19, 11, 15, 9, 15, 5, 14, 12, 16, 18, 16, 10, 3, 8, 9, 16, 2, 4, 16, 12, 11, 14, 20, 16, 2, 18, 17, 20, 3, 13, 16, 17, 1, 1, 11, 20, 20, 4]                       | true
    }

    def cleanup() {
        solution = null
    }

}
