package com.testds.leetcode.problems.uncommonFromSentences

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test UncommonFromSentences"() {
        when:
        def actualResult = solution.uncommonFromSentences(s1, s2)
        then:
        expectedResult as String[] == actualResult
        where:
        s1                    | s2                   | expectedResult
        "this apple is sweet" | "this apple is sour" | ["sweet", "sour"]
        "apple apple"         | "banana"             | ["banana"]
        "s z z z s"           | "s z ejt"            | ["ejt"]
        "apple apple   "      | "banana"             | ["banana"]
    }

}
