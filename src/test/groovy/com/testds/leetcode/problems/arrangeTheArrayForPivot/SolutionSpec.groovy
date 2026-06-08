package com.testds.leetcode.problems.arrangeTheArrayForPivot

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test PivotArray"() {
        when:
        def actualResult = solution.pivotArray(nums as int[], pivot as int)
        then:
        expectedResult as int[] == actualResult
        where:
        nums                      | pivot | expectedResult
        [9, 12, 5, 10, 14, 3, 10] | 10    | [9, 5, 3, 10, 10, 12, 14]
        [-3, 4, 3, 2]             | 2     | [-3, 2, 4, 3]
    }

}
