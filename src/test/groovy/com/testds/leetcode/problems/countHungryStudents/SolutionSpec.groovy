package com.testds.leetcode.problems.countHungryStudents

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CountHungryStudents"() {
        when:
        def actualResult = solution.countStudents(students as int[], sandwitches as int[])
        then:
        expectedResult == actualResult
        where:
        students           | sandwitches        | expectedResult
        [1, 1, 0, 0]       | [0, 1, 0, 1]       | 0
        [1, 1, 1, 0, 0, 1] | [1, 0, 0, 0, 1, 1] | 3
    }

}
