package com.testds.leetcode.problems.minimumCommonValue

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinimumCommonValue"() {
        when:
        def actualResult = solution.getCommon(nums1 as int[], nums2 as int[])
        then:
        expectedResult == actualResult
        where:
        nums1        | nums2        | expectedResult
        [1, 2, 3]    | [2, 4]       | 2
        [1, 2, 3, 6] | [2, 3, 4, 5] | 2
    }

}
