package com.testds.leetcode.problems.relativeSortArray

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test RelativeSortArray"() {
        when:
        def actualResult = solution.relativeSortArray(arr1 as int[], arr2 as int[])
        then:
        expectedResult as int[] == actualResult
        where:
        arr1                               | arr2               | expectedResult
        [2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19] | [2, 1, 4, 3, 9, 6] | [2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19]
        [28, 6, 22, 8, 44, 17]             | [22, 28, 8, 6]     | [22, 28, 8, 6, 17, 44]
    }

}
