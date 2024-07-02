package com.testds.leetcode.problems.arraysIntersection

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ArraysIntersection"() {
        when:
        def actualResult = solution.intersect(nums1 as int[], nums2 as int[])
        then:
        expectedResult as int[] == actualResult
        where:
        nums1        | nums2           | expectedResult
        [1, 2, 2, 1] | [2, 2]          | [2, 2]
        [4, 9, 5]    | [9, 4, 9, 8, 4] | [4, 9]
    }

}
