package com.testds.leetcode.problems.sortByBits

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test SortByBits"() {
        when:
        def actualResult = solution.sortByBits(arr as int[])
        then:
        expectedResult as int[] == actualResult
        where:
        arr                                           | expectedResult
        [0, 1, 2, 3, 4, 5, 6, 7, 8]                   | [0, 1, 2, 4, 8, 3, 5, 6, 7]
        [1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1] | [1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]
    }
}
