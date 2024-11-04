package com.testds.leetcode.problems.stringCompressionIII

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test StringCompressionIII"() {
        when:
        def actualResult = solution.compressedString(word)
        then:
        expectedResult == actualResult
        where:
        word               | expectedResult
        "abcde"            | "1a1b1c1d1e"
        "aaaaaaaaaaaaaabb" | "9a5a2b"
    }

}
