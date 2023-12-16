package com.testds.leetcode.problems.destinationCity

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test DestinationCity"() {
        when:
        def actualResult = solution.destCity(paths)
        then:
        expectedResult == actualResult
        where:
        paths                                                                 | expectedResult
        [["London", "New York"], ["New York", "Lima"], ["Lima", "Sao Paulo"]] | "Sao Paulo"
        [["B", "C"], ["D", "B"], ["C", "A"]]                                  | "A"
        [["A", "Z"]]                                                          | "Z"
    }

}
