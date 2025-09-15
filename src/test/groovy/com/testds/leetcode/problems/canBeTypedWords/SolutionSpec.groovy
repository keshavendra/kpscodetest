package com.testds.leetcode.problems.canBeTypedWords

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll("Testing CanBeTypedWords for text : #text, brokenLetters : #brokenLetters. Expecting result as #expectedResult")
    def "Test CanBeTypedWords"() {
        when:
        def actualResult = solution.canBeTypedWords(text, brokenLetters)
        then:
        expectedResult == actualResult
        where:
        text          | brokenLetters | expectedResult
        "leet code"   | "lt"          | 1
        "hello world" | "ad"          | 1
        "leet code"   | "e"           | 0
    }

    def cleanup() {
        solution = null
    }

}
