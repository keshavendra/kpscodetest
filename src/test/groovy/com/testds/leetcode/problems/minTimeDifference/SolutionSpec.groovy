package com.testds.leetcode.problems.minTimeDifference

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinTimeDifference"() {
        when:
        def actualResult = solution.findMinDifference(timePoints)
        then:
        expectedResult == actualResult
        where:
        timePoints                  | expectedResult
        ["23:59", "00:00"]          | 1
        ["00:00", "23:59", "00:00"] | 0
        ["01:01", "02:01", "03:00"] | 59
        ["00:00", "04:00", "22:00"] | 120
    }

}
