package com.testds.leetcode.problems.maxPossibleScore

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxPossibleScore"() {
        when:
        def actualResult = solution.maxPossibleScore(start as int[], d)
        then:
        expectedResult == actualResult
        where:
        start                    | d          | expectedResult
        [6, 0, 3]                | 2          | 4
        [2, 6, 13, 13]           | 5          | 5
        [1000000000, 1000000000] | 1000000000 | 1000000000
    }

}
