package com.testds.leetcode.problems.numOfDiceRollWithTargetSum

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test NumOfDiceRollWithTargetSum"() {
        when:
        def actualResult = solution.numRollsToTarget(dices, faces, target)
        then:
        expectedResult == actualResult
        where:
        dices | faces | target | expectedResult
        1     | 6     | 3      | 1
        2     | 6     | 7      | 6
        30    | 30    | 500    | 222616187
        1     | 2     | 3      | 0
    }

}
