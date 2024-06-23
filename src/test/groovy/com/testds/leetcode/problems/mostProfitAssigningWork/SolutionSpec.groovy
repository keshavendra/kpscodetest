package com.testds.leetcode.problems.mostProfitAssigningWork

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MostProfitAssigningWork"() {
        when:
        def actualResult = solution.maxProfitAssignment(difficulty as int[], profit as int[], workers as int[])
        then:
        expectedResult == actualResult
        where:
        difficulty       | profit               | workers      | expectedResult
        [2, 4, 6, 8, 10] | [10, 20, 30, 40, 50] | [4, 5, 6, 7] | 100
        [85, 47, 57]     | [24, 66, 99]         | [40, 25, 25] | 0
    }

}
