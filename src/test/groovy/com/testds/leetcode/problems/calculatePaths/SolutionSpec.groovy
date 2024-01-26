package com.testds.leetcode.problems.calculatePaths

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindPaths"() {
        when:
        def actualResult = solution.findPaths(m, n, maxMove, startRow, startColumn)
        then:
        expectedResult == actualResult
        where:
        m | n  | maxMove | startRow | startColumn | expectedResult
        2 | 2  | 2       | 0        | 0           | 6
        1 | 3  | 3       | 0        | 1           | 12
        8 | 7  | 16      | 1        | 5           | 102984580
        8 | 50 | 23      | 5        | 26          | 914783380
    }

}
