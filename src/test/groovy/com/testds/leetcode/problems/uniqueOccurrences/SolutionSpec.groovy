package com.testds.leetcode.problems.uniqueOccurrences

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test UniqueOccurrences"() {
        when:
        def actualResult = solution.uniqueOccurrences(arr as int[])
        then:
        expectedResult == actualResult
        where:
        arr                                | expectedResult
        [1, 2, 2, 1, 1, 3]                 | true
        [1, 2]                             | false
        [-3, 0, 1, -3, 1, 1, 1, -3, 10, 0] | true
    }

}
