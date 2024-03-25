package com.testds.leetcode.problems.findDuplicates

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindDuplicates"() {
        when:
        def actualResult = solution.findDuplicates(nums as int[])
        then:
        expectedResult.containsAll(actualResult)
        actualResult.containsAll(expectedResult)
        where:
        nums                     | expectedResult
        [4, 3, 2, 7, 8, 2, 3, 1] | [2, 3]
        [1, 1, 2]                | [1]
        [1]                      | []
        [2, 2]                   | [2]
    }

}
