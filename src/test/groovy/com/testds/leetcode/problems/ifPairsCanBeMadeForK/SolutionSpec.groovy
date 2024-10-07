package com.testds.leetcode.problems.ifPairsCanBeMadeForK

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test IfPairsCanBeMadeForK"() {
        when:
        def actualResult = solution.canArrange(arr as int[], k)
        then:
        expectedResult == actualResult
        where:
        arr                                 | k | expectedResult
//        [1, 2, 3, 4, 5, 10, 6, 7, 8, 9]     | 5 | true
        [-1, 1, -2, 2, -3, 3, -4, 4]        | 3 | true
//        [-4, -7, 5, 2, 9, 1, 10, 4, -8, -3] | 3 | true
    }

}
