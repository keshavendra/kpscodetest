package com.testds.leetcode.problems.vowelSpellChecker

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test VowelSpellChecker"() {
        when:
        def actualResult = solution.spellchecker(wordList as String[], queries as String[])
        then:
        expectedResult as String[] == actualResult
        where:
        wordList                         | queries                                                                          | expectedResult
        ["KiTe", "kite", "hare", "Hare"] | ["kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"] | ["kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe"]
        ["KiTe", "kite", "hare", "Hare"] | ["keto"]                                                                         | ["KiTe"]
        ["yellow"]                       | ["YellOw"]                                                                       | ["yellow"]
        ["YellOw"]                       | ["yeellow"]                                                                      | [""]
        ["YellOw"]                       | ["yllw"]                                                                         | [""]
        ["ae", "aa"]                     | ["UU"]                                                                           | ["ae"]
    }

    def cleanup() {
        solution = null
    }

}
