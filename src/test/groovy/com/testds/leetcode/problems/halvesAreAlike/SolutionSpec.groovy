package com.testds.leetcode.problems.halvesAreAlike

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test HalvesAreAlike"() {
        when:
        def actualResult = solution.halvesAreAlike(s)
        then:
        expectedResult == actualResult
        where:
        s          | expectedResult
        "book"     | true
        "textbook" | false
    }

}
