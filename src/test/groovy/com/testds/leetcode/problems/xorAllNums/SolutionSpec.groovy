package com.testds.leetcode.problems.xorAllNums

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test XorAllNums"() {
        when:
        def actualResult = solution.xorAllNums(nums1 as int[], nums2 as int[])
        then:
        expectedResult == actualResult
        where:
        nums1     | nums2         | expectedResult
        [2, 1, 3] | [10, 2, 5, 0] | 13
        [1, 2]    | [3, 4]        | 0
        [1]       | [2]           | 3
    }

    def cleanup() {
        solution = null
    }

}
