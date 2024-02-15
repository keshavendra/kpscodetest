package com.testds.leetcode.problems.largestPerimeterPolygon

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LargestPerimeterPolygon"() {
        when:
        def actualResult = solution.largestPerimeter(nums as int[])
        then:
        expectedResult as long == actualResult
        where:
        nums                    | expectedResult
        [5, 5, 5]               | 15
        [1, 12, 1, 2, 5, 50, 3] | 12
        [5, 5, 50]              | -1
    }

}
