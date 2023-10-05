package com.testds.leetcode.problems.topKFrequent

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test topKFrequent"() {
        when:
        def actualResult = solution.topKFrequent(nums as int[], k)
        then:
        expectedResult as int[]== actualResult
        where:
        nums               | k | expectedResult
        [1, 1, 1, 2, 2, 3] | 2 | [1, 2]
        [1]                | 1 | [1]
    }
}
