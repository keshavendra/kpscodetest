package com.testds.leetcode.problems.findContentChildren

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindContentChildren"() {
        when:
        def actualResult = solution.findContentChildren(g as int[], s as int[])
        then:
        expectedResult == actualResult
        where:
        g         | s         | expectedResult
        [1, 2, 3] | [1, 1]    | 1
        [1, 2]    | [1, 2, 3] | 2
    }

}
