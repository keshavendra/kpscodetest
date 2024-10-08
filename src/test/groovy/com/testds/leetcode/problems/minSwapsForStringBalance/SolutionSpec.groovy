package com.testds.leetcode.problems.minSwapsForStringBalance

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinSwapsForStringBalance"() {
        when:
        def actualResult = solution.minSwaps(s)
        then:
        expectedResult == actualResult
        where:
        s        | expectedResult
        "][]["   | 1
        "]]][[[" | 2
        "[]"     | 0
    }

}
