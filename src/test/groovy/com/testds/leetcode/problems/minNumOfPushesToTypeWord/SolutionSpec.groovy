package com.testds.leetcode.problems.minNumOfPushesToTypeWord

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinimumPushes"() {
        when:
        def actualResult = solution.minimumPushes(word)
        then:
        expectedResult == actualResult
        where:
        word                     | expectedResult
        "abcde"                  | 5
        "xyzxyzxyzxyz"           | 12
        "aabbccddeeffgghhiiiiii" | 24
    }

}
