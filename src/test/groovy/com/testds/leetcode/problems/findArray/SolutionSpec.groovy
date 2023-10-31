package com.testds.leetcode.problems.findArray

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindArray"() {
        when:
        def actualResult = solution.findArray(pref as int[])
        then:
        expectedResult as int[] == actualResult
        where:
        pref            | expectedResult
        [5, 2, 0, 3, 1] | [5, 7, 2, 3, 2]
        [13]            | [13]
    }
}
