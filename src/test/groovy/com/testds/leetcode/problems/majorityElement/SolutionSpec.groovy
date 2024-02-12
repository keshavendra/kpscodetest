package com.testds.leetcode.problems.majorityElement

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MajorityElement"() {
        when:
        def actualResult = solution.majorityElement(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                  | expectedResult
        [3, 2, 3]             | 3
        [2, 2, 1, 1, 1, 2, 2] | 2
    }

}
