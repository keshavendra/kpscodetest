package com.testds.leetcode.problems.lengthOfTheLongestCommonPrefixInIntegers

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LongestCommonPrefix"() {
        when:
        def actualResult = solution.longestCommonPrefix(arr1 as int[], arr2 as int[])
        then:
        expectedResult == actualResult
        where:
        arr1         | arr2      | expectedResult
        [1, 10, 100] | [1000]    | 3
        [1, 2, 3]    | [4, 4, 4] | 0
    }

    def cleanup() {
        solution = null
    }

}
