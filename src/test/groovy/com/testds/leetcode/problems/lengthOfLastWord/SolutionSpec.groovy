package com.testds.leetcode.problems.lengthOfLastWord

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LengthOfLastWord"() {
        when:
        def actualResult = solution.lengthOfLastWord(s)
        then:
        expectedResult == actualResult
        where:
        s                             | expectedResult
        "Hello World"                 | 5
        "   fly me   to   the moon  " | 4
        "luffy is still joyboy"       | 6
    }

}
