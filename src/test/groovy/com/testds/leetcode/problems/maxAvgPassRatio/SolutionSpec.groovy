package com.testds.leetcode.problems.maxAvgPassRatio

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxAverageRatio"() {
        when:
        def actualResult = solution.maxAverageRatio(classes as int[][], extraStudents)
        then:
        expectedResult as double == actualResult
        where:
        classes                           | extraStudents | expectedResult
        [[1, 2], [3, 5], [2, 2]]          | 2             | 0.78333
        [[2, 4], [3, 9], [4, 5], [2, 10]] | 4             | 0.53485
    }

    def cleanup() {
        solution = null
    }

}
