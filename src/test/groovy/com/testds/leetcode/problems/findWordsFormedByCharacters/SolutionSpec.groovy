package com.testds.leetcode.problems.findWordsFormedByCharacters

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CountCharacters"() {
        when:
        def actualResult = solution.countCharacters(words as String[], chars)
        then:
        expectedResult == actualResult
        where:
        words                          | chars            | expectedResult
        ["cat", "bt", "hat", "tree"]   | "atach"          | 6
        ["hello", "world", "leetcode"] | "welldonehoneyr" | 10
    }

}
