package com.testds.leetcode.problems.findThePeaks

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindThePeaks"() {
        when:
        def actualResult = solution.findPeaks(mountain as int[])
        then:
        expectedResult == actualResult
        where:
        mountain        | expectedResult
        [2, 4, 4]       | []
        [1, 4, 3, 8, 5] | [1, 3]
    }

}
