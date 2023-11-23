package com.testds.leetcode.problems.canMakeArithmeticProgression

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CanMakeArithmeticProgression"() {
        when:
        def actualResult = solution.canMakeArithmeticProgression(arr as int[])
        then:
        expectedResult == actualResult
        where:
        arr       | expectedResult
        [3, 5, 1] | true
        [1, 2, 4] | false
    }

}
