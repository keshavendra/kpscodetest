package com.testds.leetcode.problems.maximumImportanceOfRoads

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaximumImportance"() {
        when:
        def actualResult = solution.maximumImportance(n as int, roads as int[][])
        then:
        expectedResult as long == actualResult
        where:
        n | roads                                            | expectedResult
        5 | [[0, 1], [1, 2], [2, 3], [0, 2], [1, 3], [2, 4]] | 43
        5 | [[0, 3], [2, 4], [1, 3]]                         | 20
    }

}
