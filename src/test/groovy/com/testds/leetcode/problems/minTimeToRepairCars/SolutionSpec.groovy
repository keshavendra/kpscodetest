package com.testds.leetcode.problems.minTimeToRepairCars

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinTimeToRepairCars"() {
        when:
        def actualResult = solution.repairCars(ranks as int[], cars)
        then:
        expectedResult as long == actualResult
        where:
        ranks        | cars | expectedResult
        [4, 2, 3, 1] | 10   | 16
        [5, 1, 8]    | 6    | 16
    }

}
