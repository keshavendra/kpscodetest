package com.testds.leetcode.problems.maxNumberOfBalloons

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxNumberOfBalloons"() {
        when:
        def actualResult = solution.maxNumberOfBalloons(text)
        then:
        expectedResult == actualResult
        where:
        text               | expectedResult
        "nlaebolko"        | 1
        "loonbalxballpoon" | 2
        "leetcode"         | 0
    }

}
