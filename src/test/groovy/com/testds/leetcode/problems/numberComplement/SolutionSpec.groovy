package com.testds.leetcode.problems.numberComplement

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindComplement"() {
        when:
        def actualResult = solution.findComplement(num)
        then:
        expectedResult == actualResult
        where:
        num | expectedResult
        5   | 2
        1   | 0
    }

}
