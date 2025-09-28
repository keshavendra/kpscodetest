package com.testds.leetcode.problems.largestPerimeter

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LargestPerimeter"() {
        when:
        def actualResult = solution.largestPerimeter(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums          | expectedResult
        [2, 1, 2]     | 5
        [1, 2, 1, 10] | 0
        [3, 2, 3, 4]  | 10
    }

    def cleanup() {
        solution = null
    }

}
