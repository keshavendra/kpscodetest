package com.testds.leetcode.problems.numberOfValidTriangles

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test TriangleNumber"() {
        when:
        def actualResult = solution.triangleNumber(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                        | expectedResult
        [2, 2, 3, 4]                | 3
        [4, 2, 3, 4]                | 4
        [24, 3, 82, 22, 35, 84, 19] | 10
    }

    def cleanup(){
        solution = null
    }
}
