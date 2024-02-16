package com.testds.leetcode.problems.findLeastNumOfUniqueInts

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindLeastNumOfUniqueInts"() {
        when:
        def actualResult = solution.findLeastNumOfUniqueInts(arr as int[], k)
        then:
        expectedResult == actualResult
        where:
        arr                   | k | expectedResult
        [5, 5, 4]             | 1 | 1
        [4, 3, 1, 1, 3, 3, 2] | 3 | 2
    }

}
