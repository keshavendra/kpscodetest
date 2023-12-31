package com.testds.leetcode.problems.minDifcltyOfJobSchdl

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinDifcltyOfJobSchdl"() {
        when:
        def actualResult = solution.minDifficulty(jobDifficulty as int[], d)
        then:
        expectedResult == actualResult
        where:
        jobDifficulty      | d | expectedResult
        [6, 5, 4, 3, 2, 1] | 2 | 7
        [9, 9, 9]          | 4 | -1
        [1, 1, 1]          | 3 | 3
    }

}
