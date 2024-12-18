package com.testds.leetcode.problems.finalPriceWithSpcDiscount

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FinalPrices"() {
        when:
        def actualResult = solution.finalPrices(prices as int[])
        then:
        expectedResult as int[] == actualResult
        where:
        prices          | expectedResult
        [1, 2, 3, 4, 5] | [1, 2, 3, 4, 5]
        [8, 4, 6, 2, 3] | [4, 2, 4, 2, 3]
        [10, 1, 1, 6]   | [9, 0, 1, 6]
    }

    def cleanup() {
        solution = null
    }

}
