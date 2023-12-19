package com.testds.leetcode.problems.imageSmoother

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ImageSmoother"() {
        when:
        def actualResult = solution.imageSmoother(img as int[][])
        then:
        expectedResult as int[][] == actualResult
        where:
        img                                                | expectedResult
        [[1, 1, 1], [1, 0, 1], [1, 1, 1]]                  | [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
        [[100, 200, 100], [200, 50, 200], [100, 200, 100]] | [[137, 141, 137], [141, 138, 141], [137, 141, 137]]
    }

}
