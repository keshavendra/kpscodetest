package com.testds.leetcode.problems.combinationSumIV

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "all possible combination to get the target"() {
        when:
        def actualResult = solution.combinationSum4(nums as int[], target)
        then:
        expectedResult == actualResult
        where:
        nums                                                                                  | target | expectedResult
        [1, 2, 3]                                                                             | 4      | 7
        [9]                                                                                   | 3      | 0
        [3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25] | 10     | 9
    }
}
