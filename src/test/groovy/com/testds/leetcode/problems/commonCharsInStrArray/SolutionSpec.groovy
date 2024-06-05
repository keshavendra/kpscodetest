package com.testds.leetcode.problems.commonCharsInStrArray

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CommonCharsInStrArray"() {
        when:
        def actualResult = solution.commonChars(words as String[])
        then:
        expectedResult == actualResult
        where:
        words                        | expectedResult
        ["bella", "label", "roller"] | ["e", "l", "l"]
        ["cool", "lock", "cook"]     | ["c", "o"]
    }

}
