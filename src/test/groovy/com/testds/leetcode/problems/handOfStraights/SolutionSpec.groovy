package com.testds.leetcode.problems.handOfStraights

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test HandOfStraights"() {
        when:
        def actualResult = solution.isNStraightHand(hand as int[], groupSize)
        then:
        expectedResult == actualResult
        where:
        hand                        | groupSize | expectedResult
        [1, 2, 3, 6, 2, 3, 4, 7, 8] | 3         | true
        [1, 2, 3, 4, 5]             | 4         | false
    }

}
