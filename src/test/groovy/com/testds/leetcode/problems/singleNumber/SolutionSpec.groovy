package com.testds.leetcode.problems.singleNumber

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Find the singleNumber in the list of duplicates"() {
        when:
        int actualNumber = solution.singleNumber(nums as int[])
        then:
        expectedNumber == actualNumber
        where:
        nums            | expectedNumber
        [2, 2, 1]       | 1
        [4, 1, 2, 1, 2] | 4
        [1]             | 1
    }
}
