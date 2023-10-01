package com.testds.leetcode.problems.reverseWordsInAString3

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test Reverse Words in String"() {
        when:
        def actualResult = solution.reverseWords(s)
        then:
        expectedResult == actualResult
        where:
        s                             | expectedResult
        "Let's take LeetCode contest" | "s'teL ekat edoCteeL tsetnoc"
        "God Ding"                    | "doG gniD"
    }
}
