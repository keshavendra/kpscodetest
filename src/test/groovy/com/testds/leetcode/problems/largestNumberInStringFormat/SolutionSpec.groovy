package com.testds.leetcode.problems.largestNumberInStringFormat

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LargestNumberInStringFormat"() {
        when:
        def actualResult = solution.largestNumber(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                                    | expectedResult
        [10, 2]                                 | "210"
        [3, 30, 34, 5, 9]                       | "9534330"
        [34, 30]                                | "3430"
        [34323, 3432]                           | "343234323"
        [8308, 8308, 830]                       | "83088308830"
        [0, 0]                                  | "0"
        [3, 43, 48, 94, 85, 33, 64, 32, 63, 66] | "9485666463484333332"
    }

}
