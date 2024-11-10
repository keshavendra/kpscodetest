package com.testds.leetcode.problems.minimumSubarrayLengthForORAtleastK

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinimumSubarrayLengthForORAtleastK"() {
        when:
        def actualResult = solution.minimumSubarrayLength(nums as int[], k)
        then:
        expectedResult == actualResult
        where:
        nums           | k  | expectedResult
        [1, 2, 3]      | 2  | 1
        [2, 1, 8]      | 10 | 3
        [1, 2]         | 0  | 1
        [1, 2, 32, 21] | 55 | 3
    }

    def cleanup() {
        solution = null
    }

}
