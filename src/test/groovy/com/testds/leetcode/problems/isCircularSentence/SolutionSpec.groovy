package com.testds.leetcode.problems.isCircularSentence

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test IsCircularSentence"() {
        when:
        def actualResult = solution.isCircularSentence(sentence)
        then:
        expectedResult == actualResult
        where:
        sentence                              | expectedResult
        "leetcode exercises sound delightful" | true
        "eetcode"                             | true
        "Leetcode is cool"                    | false
    }

}
