package com.testds.leetcode.problems.minSumOfLengths

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll("all the positive scenarios where arr : #arr and target: #target expectation is #expectedResult")
    def "Test MinSumOfLengths"() {
        when:
        def actualResult = solution.minSumOfLengths(arr as int[], target)
        then:
        expectedResult == actualResult
        where:
        arr                      | target | expectedResult
        [3, 2, 2, 4, 3]          | 3      | 2
        [7, 3, 4, 7]             | 7      | 2
        [1, 2, 3, 3, 6]          | 6      | 3
        [1, 1, 1, 2, 2, 2, 4, 4] | 6      | 6
    }

    @Unroll("These scenarios do not have proper solution and hence expectedResult is -1 for input #arr and target #target")
    def "No proper solution hence -1"() {
        when:
        def actualResult = solution.minSumOfLengths(arr as int[], target)
        then:
        noExceptionThrown()
        actualResult == -1
        where:
        arr                   | target
        [4, 3, 2, 6, 2, 3, 4] | 6
    }

    def cleanup() {
        solution = null
    }

}
