package com.testds.leetcode.problems.maxLengthBetweenEqualCharacters

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxLengthBetweenEqualCharacters"() {
        when:
        def actualResult = solution.maxLengthBetweenEqualCharacters(s)
        then:
        expectedResult == actualResult
        where:
        s                           | expectedResult
        "aa"                        | 0
        "abca"                      | 2
        "cbzxy"                     | -1
        "mgntdygtxrvxjnwksqhxuxtrv" | 18
    }

}
