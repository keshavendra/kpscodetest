package com.testds.leetcode.problems.wordsWithSubsets

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test WordsWithSubsets"() {
        when:
        def actualResult = solution.wordSubsets(words1 as String[], words2 as String[])
        then:
        expectedResult.containsAll(actualResult)
        actualResult.containsAll(expectedResult)
        where:
        words1                                                | words2     | expectedResult
        ["amazon", "apple", "facebook", "google", "leetcode"] | ["e", "o"] | ["facebook", "google", "leetcode"]
//        ["amazon", "apple", "facebook", "google", "leetcode"] | ["l", "e"] | ["apple", "google", "leetcode"]
    }

    def cleanup() {
        solution = null
    }

}
