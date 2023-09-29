package com.testds.leetcode.problems.monotonicArray

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test if given array is Monotonic"() {
        when:
        def actualResult = solution.isMonotonic(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums         | expectedResult
        [1, 2, 2, 3] | true
        [6, 5, 4, 4] | true
        [1, 3, 2]    | false
    }
}
