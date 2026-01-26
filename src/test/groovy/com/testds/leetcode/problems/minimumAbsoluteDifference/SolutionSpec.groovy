package com.testds.leetcode.problems.minimumAbsoluteDifference

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test MinimumAbsoluteDifference"() {
        when:
        def actualResult = solution.minimumAbsDifference(arr as int[])
        then:
        expectedResult == actualResult
        where:
        arr                              | expectedResult
        [4, 2, 1, 3]                     | [[1, 2], [2, 3], [3, 4]]
        [1, 3, 6, 10, 15]                | [[1, 3]]
        [3, 8, -10, 23, 19, -4, -14, 27] | [[-14, -10], [19, 23], [23, 27]]
    }

    def cleanup() {
        solution = null
    }

}
