package com.testds.leetcode.problems.peopleAwareOfSecret

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test PeopleAwareOfSecret"() {
        when:
        def actualResult = solution.peopleAwareOfSecret(n, delay, forget)
        then:
        expectedResult == actualResult
        where:
        n   | delay | forget | expectedResult
        6   | 2     | 4      | 5
        4   | 1     | 3      | 6
        684 | 18    | 496    | 653668527
        4   | 1     | 4      | 8
    }

}
