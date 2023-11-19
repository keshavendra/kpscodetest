package com.testds.leetcode.problems.generatedMaxFrequency

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test GeneratedMaxFrequency"() {
        when:
        def actualResult = solution.maxFrequency(nums as int[], k)
        then:
        expectedResult == actualResult
        where:
        nums          | k | expectedResult
        [1, 2, 4]     | 5 | 3
        [1, 4, 8, 13] | 5 | 2
        [3, 9, 6]     | 2 | 1
        [4, 4, 4, 4]  | 5 | 4
    }

}
