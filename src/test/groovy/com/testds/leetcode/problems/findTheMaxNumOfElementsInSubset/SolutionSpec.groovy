package com.testds.leetcode.problems.findTheMaxNumOfElementsInSubset

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaximumLength"() {
        when:
        def actualResult = solution.maximumLength(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                                                                     | expectedResult
        [5, 4, 1, 2, 2]                                                          | 3
        [1, 3, 2, 4]                                                             | 1
        [1, 1]                                                                   | 1
        [1, 16, 49, 16, 121]                                                     | 1
        [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024] | 9
    }

}
