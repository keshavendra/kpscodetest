package com.testds.leetcode.problems.largestDivisibleSubset

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LargestDivisibleSubset"() {
        when:
        def actualResult = solution.largestDivisibleSubset(nums as int[])
        then:
        assert actualResult
        assert actualResult.size() == expectedResult.size()
        where:
        nums                                        | expectedResult
        [1, 2, 3]                                   | [1, 2]
        [1, 2, 4, 8]                                | [1, 2, 3, 4]
        [5, 9, 18, 54, 108, 540, 90, 180, 360, 720] | [9, 18, 90, 180, 360, 720]
    }

}
