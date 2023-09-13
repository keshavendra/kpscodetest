package com.testds.leetcode.problems.minimumDeletionToMakeCharacterFrequencyUnique

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test minimum deletion required to make the frequencies unique"() {
        when:
        def actualResult = solution.minDeletions(s)
        then:
        actualResult == expectedResult
        where:
        s          | expectedResult
        'aab'      | 0
        'aaabbbcc' | 2
        'ceabaacb' | 2
        'abcabc'   | 3
        'bbcebab'  | 2
    }
}
