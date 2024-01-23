package com.testds.leetcode.problems.sumSubarrayMins

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test SumSubarrayMins"() {
        when:
        def actualResult = solution.sumSubarrayMins(arr as int[])
        then:
        expectedResult == actualResult
        where:
        arr                 | expectedResult
        [3, 1, 2, 4]        | 17
        [11, 81, 94, 43, 3] | 444
    }

}
